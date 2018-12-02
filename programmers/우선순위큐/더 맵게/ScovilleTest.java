import org.junit.Test;
 
import static org.junit.Assert.*;
 
public class ScovilleTest {
    Scoville s = new Scoville();
    int[] sco = {1, 2, 3, 9, 10, 12};
 
    @Test
    public void 테스트_결과() {
        assertEquals(2, s.solution(sco, 7));
    }
}