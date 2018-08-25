#include <string>
#include <vector>
using namespace std;
string solution(string s) {
    string answer = "";
    int i = 0;
    vector<string> sv;
    sv.push_back(s);
    i=sv[0].size();
    if (i % 2 == 0)
    {
        answer = sv[0].substr(i / 2-1, 2);
        return answer;
    }
    else
    {
        answer = sv[0].substr(i / 2, 1);
        return answer;
    }
}
