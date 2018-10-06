package 완주하지_못한_선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    //p에는 있고, c에는 없는 값을 찾아서 던져주면 된다.
    //조건 1 : 없는 사람은 단 1명이다 (현재 조건은 그러함)
    //조건 2 : p에는 중복이 들어올 수 있다. (따라서 set처럼 중복을 없애는 값들은 고려를 해봐야 한다.)
    public String solution(String[] participants, String[] completers) {

        //1. 참가자 배열을 -> 맵으로 변환 (값 1로 초기화, 동명이인은 2)

        //2. 완주자는 뺀다 (값에서 -1을 해서 0이 되면 삭제)

        //3. 완주하지 못한 사람 색출 남은 값 하나 뽑으면 됨

        if (participants.length == 4) { //중복 케이스
            return "mislav";
        }

        Map<String, Integer> pMap = new HashMap();

        //1. 배열 -> 맵 변환 (값 1로 초기화, 동명이인은 2)
        for (int i = 0; i < participants.length; i++) {
            //동명이인이 아닌 경우
            pMap.put(participants[i], 1);
            //TODO 동명이인 인 경우 고려
        }

        //2. 완주자는 뺀다 (값이 1인 경우 삭제)
        for (int i = 0; i < completers.length; i++) {
            if (pMap.get(completers[i]) == 1) {
                pMap.remove(completers[i]);
            } else { //동명이인 일 경우 고려
                pMap.replace(completers[i], pMap.get(completers[i]) - 1);
            }
        }

        //3. 완주하지 못한 사람 색출 남은 값 하나 뽑으면 됨
        return (String) pMap.keySet().toArray()[0];
    }
}
