//- 문제 설명
//어떤 문장의 각 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 바꾸는 암호화 방식을 시저 암호라고 합니다. 예를 들어 AB는 1만큼 밀면 BC가 되고, 3만큼 밀면 DE가 됩니다. z는 1만큼 밀면 a가 됩니다. 문자열 s와 거리 n을 입력받아 s를 n만큼 민 암호문을 만드는 함수, solution을 완성해 보세요.

//- 제한 조건
//공백은 아무리 밀어도 공백입니다.
//s는 알파벳 소문자, 대문자, 공백으로만 이루어져 있습니다.
//s의 길이는 8000이하입니다.
//n은 1 이상, 25이하인 자연수입니다.
#include <string>
#include <vector>
 
using namespace std;
 
string solution(string s, int n) {
    string answer = "";
 
    for (int i = 0; i < s.size(); i++)
    {
        if (64 < s[i] && s[i] < 91)//대문자일때
        {
            if ((s[i] + n) < 91 && s[i] != 32)//n만큼 밀었을때 'Z'를 초과하지 않을때
            {
                s[i] += n;
                answer.push_back(s[i]);
            }
            else if (s[i] == 32)//공백문자
            {
                answer.push_back(s[i]);
            }
            else////n만큼 밀었을때 'Z'를 초과할때
            {
                s[i] = (s[i] + n + 65) - 91;
                answer.push_back(s[i]);
            }
        }
        else//소문자일때
        {
            if ((s[i] + n) < 123 && s[i] != 32)
            {
                s[i] += n;
                answer.push_back(s[i]);
            }
            else if (s[i] == 32)
            {
                answer.push_back(s[i]);
            }
            else
            {
                s[i] = (s[i] + n + 97) - 123;
                answer.push_back(s[i]);
            }
        }
    }
 
    return answer;
}
