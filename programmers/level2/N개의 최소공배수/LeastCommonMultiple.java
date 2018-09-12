//문제 설명
//두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다. 
//예를 들어 2와 7의 최소공배수는 14가 됩니다. 정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다. 
//n개의 숫자를 담은 배열 arr이 입력되었을 때 이 수들의 최소공배수를 반환하는 함수, solution을 완성해 주세요.

//제한 사항
//arr은 길이 1이상, 15이하인 배열입니다.
//arr의 원소는 100 이하인 자연수입니다.

public class LeastCommonMultiple {
    public int solution(int[] arr) {
        int answer=lcm(arr[0],arr[1]);
        //1.최소 공배수, 최대 공약수를 구하는 함수를 구현한다.
        //2.첫번째 원소와 두번째 원소의 최소 공배수를 구한다.
 
        for(int i=2;i<arr.length;i++)
        {
            //3.그 최소 공배수를 가지고 그 다음 원소와의 최소 공배수를 구한다.
            //4.마지막 배열의 원소까지 이 2번과정을 반복한다.
            answer=lcm(answer,arr[i]);
        }
        return answer;
    }
 
    public int gcd(int a, int b) {//최대 공약수 구하는 함수
        while (b != 0) {
            int Temp = a % b;
            a = b;
            b = Temp;
        }
        return a;
    }
    public int lcm(int a, int b) {//최소 공배수 구하는 함수
        return (int) a * b / gcd(a,b);
    }
}
 
