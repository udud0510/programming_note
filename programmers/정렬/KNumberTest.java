import org.junit.Test;
import static org.junit.Assert.*;
 
 
public class KNumberTest {
    KNumber k=new KNumber();
    int []array={1,5,2,6,3,7,4};
    int [][]commands={{2,5,3},{4,4,1},{1,7,3}};
    int [] Return={5,6,3};
 
    @Test
    public void 테스트결과(){
        assertArrayEquals(Return,k.solution(array,commands));
    }
}
