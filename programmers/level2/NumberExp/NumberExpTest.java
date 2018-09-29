package qwer;

import org.junit.Test;
import static org.junit.Assert.*;



public class NumberExpTest {
    NumberExp n= new NumberExp();

    @Test
    public void 테스트결과() {
        assertEquals(4,n.solution(15));
        assertEquals(2,n.solution(12));
    }
}