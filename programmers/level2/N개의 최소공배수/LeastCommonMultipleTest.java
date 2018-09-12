package qwer;
 
import org.junit.Test;
 
import static org.junit.Assert.*;
 
 
public class LeastCommonMultipleTest {
    LeastCommonMultiple L=new LeastCommonMultiple();
    int []arr1={2,6,8,14};
    int []arr2={1,2,3};
 
    @Test
    public void 테스트결과(){
        assertEquals(168,L.solution(arr1));
        assertEquals(6,L.solution(arr2));
    }
 