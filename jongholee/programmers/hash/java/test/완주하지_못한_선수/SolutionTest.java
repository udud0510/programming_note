package 완주하지_못한_선수;

import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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

    @Test
    public void testSet() {
        //set에 키가 중복이 된다면..

        Set set = new HashSet();
        set.add("a");
        set.add("b");
        set.add("b");
        set.add("c");

        assertEquals("[a, b, c]", set.toString());

        set.remove("c");

        assertEquals("[a, b]", set.toString());
    }

    @Test
    public void testMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);

        assertEquals("{a=1, b=2}", map.toString());
        map.replace("b", map.get("b") + 1);
        assertEquals("{a=1, b=3}", map.toString());
        map.replace("b", map.get("b") + 1);
    }
}