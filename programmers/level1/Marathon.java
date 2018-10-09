import java.util.HashMap;

/*  수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

        마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.

        제한사항
        마라톤 경기에 참여한 선수의 수는 1명 이상 100,000명 이하입니다.
        completion의 길이는 participant의 길이보다 1 작습니다.
        참가자의 이름은 1개 이상 20개 이하의 알파벳 소문자로 이루어져 있습니다.
        참가자 중에는 동명이인이 있을 수 있습니다.*/
public class Marathon {

    /*public static void main(String[] args){

        System.out.println(marathon(new String[]{"leo", "kiki", "eden"}, new String[]{"eden","kiki"}));
        System.out.println(marathon(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "filipa"}));
        System.out.println(marathon(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{ "stanko", "mislav", "ana"}));
    }*/
    static String marathon(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> map = new HashMap<>();

        //맵에 동명이인을 고려해서 참가자 넣기
        for (String runner : participant) {
            if (map.get(runner) == null) {
                map.put(runner, 1);

            } else {  //value 값이 2 이상인 경우 동명이인
                int value = map.get(runner) + 1;
                map.put(runner, value);
            }
        }

        for (String runner : completion) {
            int value = map.get(runner) - 1;
            map.put(runner, value);
        }

        for (String runner : map.keySet()) {
            if (map.get(runner) == 1) {
                answer = runner;
            }
        }


        return answer;
    }

}