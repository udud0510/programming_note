import org.junit.Test;
import static org.junit.Assert.*;
 
public class TowerTest {
    Tower t=new Tower();
 
    int []heigth1={6,9,5,7,4};
    int []height2={3,9,9,3,5,7,2};
    int []height3={1,5,3,6,7,6,5};
 
    int []r1={0,0,2,2,4};
    int []r2={0,0,0,3,3,3,6};
    int []r3={0,0,2,0,0,5,6};
 
    @Test
    public void 테스트_결과() {
        assertArrayEquals(r1,t.solution(heigth1));
        assertArrayEquals(r2,t.solution(height2));
        assertArrayEquals(r3,t.solution(height3));
    }
}