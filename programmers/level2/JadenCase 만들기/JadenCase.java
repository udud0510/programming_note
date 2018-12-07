public class JadenCase {
    public String solution(String s) {
        String answer="";
        String str=s.toLowerCase();//문자를 모두 소문자로 바꿔준다.
        char []ary=str.toCharArray();
 
        answer+=Character.toUpperCase(ary[0]);//맨 앞 문자는 대문자다.
 
        for(int i=1;i<ary.length;i++)
        {
            if(ary[i]==' ')
            {
                ary[i+1]=Character.toUpperCase(ary[i+1]);//공백 뒤의 문자는 대문자로 바꿔준다.
            }
            answer+=ary[i];//char형 문자를 스트링에 더해줬다.
        }
        return answer;
    }
}