#include <string>
#include <vector>
 
using namespace std;
 
vector<string> solution(vector<string> strings, int n) {
 
    for (int i = 0; i < strings.size(); i++)//버블정렬 코드
    {
        for (int j = i+1; j <= strings.size()-1; j++)
        {
            if (strings[i][n]>strings[j][n])//문제의 메인 조건(오름차순 정렬)
            {
                strings[i].swap(strings[j]);
            }
            else if (strings[i][n] == strings[j][n] && strings[i]>strings[j])//인덱스 문자가 같을 사전순으로 정렬
            {
                strings[i].swap(strings[j]);
            }
 
        }
    }
    return strings;
}