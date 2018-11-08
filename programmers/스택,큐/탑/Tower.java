public class Tower {
    public int[] solution(int[] heights) {
        int [] answer=new int[heights.length];//정답의 배열 크기는 타워의 갯수랑 같다
        int index=0;

        for(int i=0;i<heights.length;i++){
            if(!checkSign(heights, answer, false, index, i)){//왼쪽의 타워에서 수신할 수 없을때
                answer[index]=0;
            }
            index++;
        }
        return answer;
    }
    private boolean checkSign(int[] heights, int[] answer, boolean checkHeight, int index, int i) {
        for(int j=i;j>=0;j--){//왼쪽으로 신호를 보내기 때문
            if(heights[i]<heights[j]){//타워의 사인을 수신할 수 있는지 확인(같은 높이도 수신할 수 없다)
                answer[index]=j+1;//인덱스 0번=1번 타워
                checkHeight=true;
                break;
            }
        }
        return checkHeight;
    }
}
