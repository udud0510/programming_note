import org.junit.Test;
import static org.junit.Assert.*;
 
public class camouflageTest {
    camouflage c=new camouflage();
    String [][]clo={{"yellow_hat", "headgear"},{"blue_sunglasses", "eyewear"},{"green_turban", "headgear"}};
    String [][]clo2={{"crow_mask", "face"},{"blue_sunglasses", "face"},{"smoky_makeup", "face"}}
 
    @Test
    public void 테스트_결과() {
        assertEquals(5,c.solution(clo));
        assertEquals(3,c.solution(clo2));
    }
}