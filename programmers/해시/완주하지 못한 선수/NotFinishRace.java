import java.util.HashMap;
import java.util.Map;

public class NotFinishRace {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String,Integer>info=new HashMap<>();

        InsertPartInfo(participant, info);//참가자 정보를 해시맵에 넣었다.
        FindNotComplete(completion, info);//완주하지 못한 참가자를 찾았다.

        answer = GetAnswer(answer, info);

        return answer;
    }

    public String GetAnswer(String answer, Map<String, Integer> info) {
        for(String key:info.keySet()){
            if(info.get(key)==1) {//완주하지 못한 참가자 value=1
                answer = key;
            }
        }
        return answer;
    }
    public void FindNotComplete(String[] completion, Map<String, Integer> info) {
        int Value;
        for(String com:completion){//완주한 사람 value=0 만들기
            Value=info.get(com)-1;
            info.put(com,Value);
        }
    }
    public void InsertPartInfo(String[] participant, Map<String, Integer> info) {
        int Value;
        for(String part:participant){
            if(info.get(part)==null){
                info.put(part,1);
            }
            else{//동명이인
                Value=info.get(part)+1;
                info.put(part,Value);
            }
        }
    }
}
