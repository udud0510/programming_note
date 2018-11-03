import java.util.PriorityQueue;
 
public class Scoville {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> scoInfo = new PriorityQueue<Integer>(scoville.length);
 
        addElement(scoville, scoInfo);
 
        return getAnswer(K, answer, scoInfo);
    }
 
    public int getAnswer(int K, int answer, PriorityQueue<Integer> scoInfo) {
        int tempSco;
        while (scoInfo.peek()<=K){//우선 순위큐의 제일 낮은 값이 K미만이면 실행
 
            if(scoInfo.size()<2){//예외 처리
                return -1;
            }
 
            tempSco=scoInfo.poll()+(scoInfo.poll()*2);//섞은 음식의 스코빌 지수 = 가장 맵지 않은 음식의 스코빌 지수 + (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)
            scoInfo.add(tempSco);//가독성을 위해 tempSco이용
            answer++;
        }
        return answer;
    }
 
    public void addElement(int[] scoville, PriorityQueue<Integer> scoInfo) {
        for (int i : scoville) {//index접근 피하기(outOfIndex 에러)
            scoInfo.add(i);
        }
    }
}