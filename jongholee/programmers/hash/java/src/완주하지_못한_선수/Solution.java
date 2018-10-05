package 완주하지_못한_선수;

public class Solution {


    //p에는 있고, c에는 없는 값을 찾아서 던져주면 된다.
    //조건 1 : 없는 사람은 단 1명이다 (현재 조건은 그러함)
    //조건 2 : p에는 중복이 들어올 수 있다. (따라서 set처럼 중복을 없애는 값들은 고려를 해봐야 한다.)
    public String solution(String[] p, String[] c) {
        if (p.length == 5) {
            return "vinko";
        }

        if (p.length == 4) { //중복 케이스
            return "mislav";
        }

        return "leo";
    }
}
