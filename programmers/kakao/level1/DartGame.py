# 문제 : https://programmers.co.kr/learn/courses/30/lessons/17682

import re
import unittest

from _operator import eq


# 설계
# 1. 문자열을 의미 단위로 쪼갠다. '1S2D*3T' -> '1', 'S', '2', 'D', '*', '3', 'T']
# 2. 점수와 보너스를 먼저 적용한다.
# 3. 옵션은 조건에 따라 처리해줘야 하므로 가독성을 위해 별도 로직으로 분기 처리. (루프 두번 태워도 시간 복잡도 o(n)으로 동일하므로.)

def solution(s):
    dic = {'S': 1, 'D': 2, 'T': 3, '*': 2, '#': -1}
    opts = [1, 1, 1]
    val = []
    index = -1
    # 1. 문자열 의미 단위로 쪼개기
    split = re.findall('\d+|[A-Z]+|[*]|[#]|[SDT]', s)
    # 2. 점수와 보너스 적용
    for i, item in enumerate(split):
        if item == 'S' or item == 'D' or item == 'T':
            val.append(pow(int(split[i - 1]), dic[item]))
            index += 1
        elif item == '#' or item == '*':
            opts[index] = item
    # 3. 옵션 적용
    for i, opt in enumerate(opts):
        if eq(opt, '*'):
            if i > 0: val[i - 1] *= 2 # 이 부분은 파이썬 배열 연산자 잘 쓰면 1줄로 줄어들텐데 책을 집에 놓고와서 찾기 귀찮다..
            val[i] *= 2
        elif eq(opt, '#'):
            val[i] *= -1
    return sum(val)


# 테스트 케이스
class Test(unittest.TestCase):

    def test_true(self):
        self.assertEqual(37, solution("1S2D*3T"))
        self.assertEqual(9, solution("1D2S#10S"))
        self.assertEqual(3, solution("1D2S0T"))
        self.assertEqual(23, solution("1S*2T*3S"))
        self.assertEqual(5, solution("1D#2S*3S"))
        self.assertEqual(-4, solution("1T2D3D#"))
        self.assertEqual(59, solution("1D2S3T*"))


if __name__ == '__main__':
    unittest.main()
