#include <string>
#include <vector>
 
using namespace std;
 
long long solution(int a, int b) {
    long long answer = 0;
    int i=0;
    if(a>b)//a가 클 경우
    {
        for(i=b;i<=a;i++)//작은 수인 b부터 a까지의 숫자를 더하는 반복문
        {
            answer+=i;
        }
        return answer;
    }
    else if(a<b)//b가 클 경우
    {
        for(i=a;i<=b;i++)//작은 수인 a부터 b까지의 숫자를 더하는 반복문
        {
            answer+=i;
        }
        return answer;
    }
    else if(a==b)//a와 b가 같을 경우 둘 중 아무거나 반환한다.
    {
        return a;
    }
}