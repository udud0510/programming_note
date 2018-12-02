import org.junit.Test;
import static org.junit.Assert.*;

public class NotFinishRaceTest {
    NotFinishRace n=new NotFinishRace();

    String[] p1={"leo", "kiki", "eden"};
    String[] p2={"marina", "josipa", "nikola", "vinko", "filipa"};
    String[] p3={"mislav", "stanko", "mislav", "ana"};

    String[] c1={"eden", "kiki"};
    String[] c2={"josipa", "filipa", "marina", "nikola"};
    String[] c3={"stanko", "ana", "mislav"};

    @Test
    public void 테스트_결과() {
        assertEquals("leo",n.solution(p1,c1));
        assertEquals("vinko",n.solution(p2,c2));
        assertEquals("mislav",n.solution(p3,c3));
    }
}