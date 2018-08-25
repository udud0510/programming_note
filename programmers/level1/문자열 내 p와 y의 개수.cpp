#include <string>
#include <iostream>
 
using namespace std;
 
bool solution(string s)
{
    int p_num = 0;
    int y_num = 0;
    int count_p = 0;
    int count_y = 0;
    bool answer = true;
 
    for (int i = 0; i < s.size(); i++)
    {
        if (s[i]=='p'||s[i]=='P')
        {
            count_p++;
        }
        else if (s[i] == 'y' || s[i] == 'Y')
        {
            count_y++;
        }
    }
 
    if (count_p != count_y)
        answer = false;
 
    return answer;
}