import java.util.*;

public class HIndex {
    public int solution(int[] citations) {
        int answer = 0;
        Vector<Integer> cit=new Vector<Integer>();

        addElement(citations, cit);//벡터에 원소 추가
        cit.sort(new comp());//역순 정렬
        answer = getHInex(answer, cit);

        return answer;
    }
    public int getHInex(int answer, Vector<Integer> cit) {
        while ((answer<cit.size()&& cit.elementAt(answer)>=answer+1)){
            answer++;
        }
        return answer;
    }
    public void addElement(int[] citations, Vector<Integer> cit) {
        for (int i:citations) {
            cit.add(i);
        }
    }
}
class comp implements Comparator<Integer> {// 인터페이스 구현
    public int compare(Integer o1, Integer o2) {
        return o1 > o2 ? -1 : (o1.equals(o2) ? 0 : 1);
    }
}