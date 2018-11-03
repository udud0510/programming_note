import java.util.*;
 
public class camouflage {
    public int solution(String[][] clothes) {
        int answer = 1;
 
        Map<String,Integer>spy=new HashMap<>();
 
        if(clothes.length<=1){//옷이 하나일때 예외처리
            return clothes.length;
        }
        getCount(clothes, spy);//종류별로 옷 가지수 구하기
 
        return getAnswer(answer, spy)-1;//아무것도 안 입었을때는 존재하지 않으니 -1
    }
 
    private int getAnswer(int answer, Map<String, Integer> spy) {
        Iterator<String> it=spy.keySet().iterator();
        while(it.hasNext()){//맵 순회하면서 answer에 value값 추가
            String key=it.next();
            if(spy.get(key)==0){//옷의 종류가 없을때
                continue;
            }
            answer*=(spy.get(key)+1);//(a의 종류+1)*(b의 종류+1)....경우의 수 
 
        }
        return answer;
    }
 
    private void getCount(String[][] clothes, Map<String, Integer> spy) {
        int count;
        for(String []s:clothes){
            if(spy.get(s[1])==null){//옷 종류의 첫 가짓수
                spy.put(s[1],1);
            }
            else{//옷 종류에 이미 다른 가짓수가 존재할 경우
                count=spy.get(s[1])+1;
                spy.put(s[1],count);
            }
        }
    }
}
