package level1;

public class Solution {
    public static boolean solution(String s) {
        int length = s.length();
        if(length ==4 || length ==6 ){
            try {
                Integer.parseInt(s);
                return true;
            } catch (NumberFormatException e){
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(solution("55"));

    }
}
