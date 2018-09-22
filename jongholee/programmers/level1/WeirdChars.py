# 문제 : https://programmers.co.kr/learn/courses/30/lessons/12930?language=python3


import unittest


def solution(s):
    splits = s.split(" ")
    result = []
    for split in splits:
        temp = ""
        for i, str in enumerate(split):
            temp += str.upper() if i % 2 == 0 else str.lower()
        result.append(temp)

    return " ".join(result)


# 테스트 케이스
class Test(unittest.TestCase):

    def test_true(self):
        self.assertEqual("TrY HeLlO WoRlD", solution("try hello world"))


if __name__ == '__main__':
    unittest.main()
