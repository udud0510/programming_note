import org.junit.Test;
 
import static org.junit.Assert.*;
 
public class JadenCaseTest {
    JadenCase j= new JadenCase();
 
    @Test
    public void 테스트결과() {
        assertEquals("3people Unfollowed Me",j.solution("3people unFollowed me"));
        assertEquals("For The Last Week",j.solution("for the last week"));
    }
}