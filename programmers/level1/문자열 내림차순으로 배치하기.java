import java.util.*;
 
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] st = s.split("");
        Arrays.sort(st);
        Collections.reverse(Arrays.asList(st));
        answer = String.join("", st);
 
        return answer;
    }
}