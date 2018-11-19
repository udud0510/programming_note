package kakao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BigNumber {
    public String solution(int[] numbers){
        String answer ="";
        List<String> list = new ArrayList<>();
        int length = numbers.length;

        for(int i=0; i<length; i++){
            list.add(Integer.toString(numbers[i]));
        }

        int size = list.size();
        //Comparator를 사용해 서로비교해 큰 값을 리턴
        //n1tjrgns.tistory.com/138에 관련 내용 정리
        /*Collections.sort(list, new Comparator<String>(){
                @Override
                public int compare(String num1,String num2){
                    return (num2+num1).compareTo(num1+num2);
                }
            });
            이렇게 작성했으나 지원하지 않는다고 IDE가 람다식으로 바꿔줌*/

        Collections.sort(list, (num1, num2) -> (num2+num1).compareTo(num1+num2));

        //배열에 0만 있는경우 0000 이런식의 출력 방지
        if(list.get(0).equals("0")){
            return "0";
        }

        for(int i=0; i<size; i++){
            answer = answer + list.get(i);
        }
        return answer;
    }
}
