import org.junit.Test;
import static org.junit.Assert.*;
 
public class FirstCharTest {
    FirstChar f=new FirstChar();
    @Test
    public void 테스트_결과() {
        assertEquals("o",f.solution("total"));
        assertEquals("r",f.solution("teeter"));
    }
}