//문제 설명
//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.

//제한사항
//arr은 길이 1 이상, 100 이하인 배열입니다.
//arr의 원소는 -10,000 이상 10,000 이하인 정수입니다.


class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double count=0;//int형으로 선언하면 소수점 아래의 숫자가 잘린다.
        
        for(int i=0;i<arr.length;i++)//배열 안의 수를 모두 더해준다.
        {
            count+=arr[i];
        }
        
        return count/arr.length;//배열의 평균값을 반환한다.
    }
}
