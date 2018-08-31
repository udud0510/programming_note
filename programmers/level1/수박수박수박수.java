class Solution {
    public String solution(int n) {
        String answer = "";
 
        for (int i = 0; i < n; i++) {//n은 문자열의 길이이다.
            if (i % 2 == 0) {//짝수일 때 "수"를 추가
                answer += "수";
            } else {         //홀수일 때 "박"을 추가
                answer += "박";
            }
        }
 
        return answer;
    }
}
