import org.junit.Test;
import static org.junit.Assert.*;
 
public class phoneNumberListTest {
    phoneNumberList p=new phoneNumberList();
    String []s1={"119","97674223","1195524421"};
    String []s2={"123","456","789"};
    String []s3={"12","123","1235","567","88"};
 
    @Test
    public void 테스트_결과() {
        assertEquals(false,p.solution(s1));
        assertEquals(true,p.solution(s2));
        assertEquals(false,p.solution(s3));
    }
}