#include <string>
#include <vector>
 
using namespace std;
 
string solution(int a, int b) {
    string answer = "";
    string day[8] = { "SUN","MON","TUE","WED","THU","FRI","SAT" };
    int month[12] = { 31,29,31,30,31,30,31,31,30,31,30,31 };
    int i;
    int allday = 0;
 
    for (i = 0; i < a-1; i++)
    {
        allday += month[i];
    }
    answer = day[(allday + b + 4) % 7];
 
    return answer;
}
