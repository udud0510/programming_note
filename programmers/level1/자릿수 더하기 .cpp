//- 문제 설명
//자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
//예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.

//- 제한사항
//N의 범위 : 100,000,000 이하의 자연수

using namespace std;
int solution(int n)
{
    int answer = 0;
 
    while (n != 0)//n을 마지막까지 n/=10연산을 하게 되면 0이 된다.
    {
        answer+=(n % 10);//일의 자릿수부터 더하기 시작한다.
        n = n / 10;
    }
 
    return answer;
}
