#include <string>
#include <vector>
#include <bitset>//10진수를 2진수로 전환하기 위해
 
using namespace std;
 
vector<string> solution(int n, vector<int> arr1, vector<int> arr2) {
    vector<string> answer;
    string *cor1 = new string[n];
    string *cor2 = new string[n];
    string *map = new string[n];
    int i, j;
 
    for (i = 0; i < n; i++)
    {
        cor1[i] = bitset<16>(arr1[i]).to_string();//문제에서 n의 범위가 1~16
        cor2[i] = bitset<16>(arr2[i]).to_string();
        for (j = 16 - n; j < 16; j++)//비트셋을 16자리로 설정했기 때문
        {
            if (cor1[i][j]-48 | cor2[i][j]-48)//0의 아스키코드 48
            {
                map[i].push_back('#');//or연산후 참
            }
            else
            {
                map[i].push_back(' ');//or연산후 
            }
        }
    }
 
    for (i = 0; i < n; i++)
    {
        answer.push_back(map[i]);
    }
<<<<<<< HEAD
=======
 
>>>>>>> e075beec45421539ef085a9062c0ac6ef3e58fe0
    return answer;
}