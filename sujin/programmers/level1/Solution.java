package level1;

public class Solution {
    public static boolean solution(String s) {
        boolean answer;

        if(s.length()==4 || s.length()==6 ){
            try {
                Integer.parseInt(s);
                answer=true;
            } catch (NumberFormatException e){
                answer=false;
            }
        }
        else{
            answer = false;
        }

        return answer;
    }

    public static void main(String[] args) {

        System.out.println(solution("55"));

    }
}
