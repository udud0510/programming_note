package 완주하지_못한_선수;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void solution() {

        String p1[] = {"leo", "kiki", "eden"};
        String p2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
        String p3[] = {"mislav", "stanko", "mislav", "ana"};

        String c1[] = {"eden", "kiki"};
        String c2[] = {"marina", "josipa", "nikola", "filipa"};
        String c3[] = {"stanko", "mislav", "ana"};

        assertEquals("leo", solution.solution(p1, c1));
        assertEquals("vinko", solution.solution(p2, c2));
        assertEquals("mislav", solution.solution(p3, c3));
    }
}