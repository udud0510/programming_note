import org.junit.Test;
import static org.junit.Assert.*;
 
public class oneTwoFourTest {
    oneTwoFour o=new oneTwoFour();
 
    @Test
    public void 테스트_결과() {
        assertEquals("1",o.solution(1));
        assertEquals("2",o.solution(2));
        assertEquals("4",o.solution(3));
        assertEquals("11",o.solution(4));
        assertEquals("12",o.solution(5));
    }
}