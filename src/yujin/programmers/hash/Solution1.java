package yujin.programmers.hash;

import java.util.HashMap;
import java.util.Map;

/*
수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.

마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,

완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
 - completion의 길이는 participant의 길이보다 1 작습니다.
 - 참가자 중에는 동명이인이 있을 수 있습니다.

 해시 사용해야함..

participant	completion	return
[leo, kiki, eden]	[eden, kiki]	leo
[marina, josipa, nikola, vinko, filipa]	[josipa, filipa, marina, nikola]	vinko
[mislav, stanko, mislav, ana]	[stanko, ana, mislav]	mislav

 */
class Solution1 {
    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> pMap = new HashMap<>();


        for (String p : participant) {
            //동명이인이 있으면,
            if (pMap.get(p) != null) {
                //기존 값에 1을 더해준 값을 추가해줌.

                //기존 값.
                int value = pMap.get(p);

                //기존값에 1을 더한 값
                value++;

                // 그 값을 넣어줌.
                pMap.put(p, value);
            } else { //동명이인이 없으면
                pMap.put(p, 1); //1추가
            }
        }

        //mis -> 2, 1
        //sta -> 1, 1
        //ana -> 1, 1

        //C에 있는 단어들은 P에서 개수를 뺀다.
        //P에 있는 단어 중 C에 존재하면 P의 단어 개수 -1
        for (String c : completion) {

            //P에 C에 값이 있는 경우 -1
            //

            if (pMap.get(c) != null) {
                int value = pMap.get(c) - 1;
                pMap.put(c, value);
            }

        }


        for (String key : pMap.keySet()) {
            if (pMap.get(key) != 0) {
                answer = key;
            }
        }


        //mis -> 1, 1
        //sta -> 0, 1
        //ana -> 0, 1

        //0이 아닌 녀석은 정답!

//            answer = "mislav";
        return answer;
    }

}