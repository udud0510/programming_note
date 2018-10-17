public class OneTwoFour {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        int []countryNumber={4,1,2};
 
        change124(n, answer, countryNumber);
 
        return answer.reverse().toString();//뒤에다 추가해서 reverse()했다.
    }
    private void change124(int n, StringBuilder answer, int[] countryNumber) {
        int check;
        while (n>0){
            check=n%3;//나머지
            n=n/3;//몫
            if (check==0){//3진수인데 3이 없다.
                n--;
            }
            answer.append(countryNumber[check]);
        }
    }
}
