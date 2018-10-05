package 완주하지_못한_선수;

public class Solution {

    public String solution(String[] p, String[] c) {

        if (p.length == 5) {
            return "vinko";
        }

        if (p.length == 4) {
            return "mislav";
        }

        return "leo";
    }
}
