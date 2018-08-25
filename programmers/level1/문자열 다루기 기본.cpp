#include <string>
#include <vector>
 
using namespace std;
 
bool solution(string s) {
 
    if (s.length() != 4 && s.length() != 6)
    {
        return false;
    }
    for (int i = 0; i < s.length(); i++)
    {
        if (48 > s[i] || s[i] > 57)
        {
            return false;
        }
    }
    return true;
}
