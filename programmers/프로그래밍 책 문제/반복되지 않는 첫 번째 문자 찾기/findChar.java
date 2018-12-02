// 문제

// - 문자열에서 처음으로 반복되지 않는 문자를 효율적으로 찾아내는 함수를 작성하라. 예를 들어 "total"에서 처음으로 등장하는 반복되지 않는 문자는 'o'이며, 
// "teeter"에서 처음으로 등장하는 반복되지 않는 문자는 'r'이다. 작성한 알고리즘의 효율에 대해 논하라

import java.util.HashMap;
import java.util.LinkedHashMap;
 
public class FirstChar {
    public String solution(String str){
        String answer="";
        HashMap<String,Integer> hash=new LinkedHashMap<>();//해시맵에 넣은 순서를 유지하기 위해
        String[] strArray=str.split("");//한글자 단위로 분리
 
        inputElement(hash, strArray);
 
        return findAnswer(answer, hash, strArray);
    }
 
    private String findAnswer(String answer, HashMap<String, Integer> hash, String[] strArray) {
        for(String s:strArray){
            if(hash.get(s)==1){
                answer=answer.concat(s);
            }
        }
        return answer;
    }
 
    private void inputElement(HashMap<String, Integer> hash, String[] strArray) {
        for(String s:strArray){
            if(hash.get(s)==null){//처음 등장하는 문자일때
                hash.put(s, 1);
            }
            else{//앞에 나왔던 문자일때는 value증가
                hash.put(s,hash.get(s)+1);
            }
        }
    }
}