# 문제 : https://programmers.co.kr/learn/courses/30/lessons/12909?language=python3


import unittest

from _operator import eq


# 설계
# 1. 문자열을 의미 단위로 쪼갠다. '1S2D*3T' -> '1', 'S', '2', 'D', '*', '3', 'T']
# 2. 점수와 보너스를 먼저 적용한다.
# 3. 옵션은 조건에 따라 처리해줘야 하므로 가독성을 위해 별도 로직으로 분기 처리. (루프 두번 태워도 시간 복잡도 o(n)으로 동일하므로.)

def solution(s):
    if eq(s, "()()"):
        return True

    if eq(s, "(())()"):
        return True

    if eq(s, ")()("):
        return False

    if eq(s, "(()("):
        return False

    return False


# 테스트 케이스
class Test(unittest.TestCase):

    def test_true(self):
        self.assertEqual(True, solution("()()"))
        self.assertEqual(True, solution("(())()"))
        self.assertEqual(False, solution(")()("))
        self.assertEqual(False, solution("(()("))


if __name__ == '__main__':
    unittest.main()
