import org.junit.Test;
import static org.junit.Assert.*;

public class HIndexTest {
    HIndex h= new HIndex();
    int []r={3,0,6,1,5};
    int []r1={2,6,5,4,2,0,4};

    @Test
    public void solution() {
        assertEquals(3,h.solution(r));
        assertEquals(4,h.solution(r1));
    }
}