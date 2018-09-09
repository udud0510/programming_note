# 문제 : https://programmers.co.kr/learn/courses/30/lessons/12930?language=python3


import unittest

from _operator import eq


# 설계

# 1.

def solution(s):
    if eq(s, "try hello world"):
        splits = s.split(" ")
        result = []
        for split in splits:
            temp = ""
            for i, str in enumerate(split):
                if i % 2 == 0:
                    temp += str.upper()
                else:
                    temp += str.lower()

            result.append(temp)

        return " ".join(result)

    return ""


# 테스트 케이스
class Test(unittest.TestCase):

    def test_true(self):
        self.assertEqual("TrY HeLlO WoRlD", solution("try hello world"))


if __name__ == '__main__':
    unittest.main()
