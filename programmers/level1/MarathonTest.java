import static org.junit.Assert.assertEquals;


public class MarathonTest {
    /*public static void main(String[] args){

        System.out.println(marathon(new String[]{"leo", "kiki", "eden"}, new String[]{"eden","kiki"}));
        System.out.println(marathon(new String[]{"marina", "josipa", "nikola", "vinko", "filipa"}, new String[]{"marina", "josipa", "nikola", "filipa"}));
        System.out.println(marathon(new String[]{"mislav", "stanko", "mislav", "ana"}, new String[]{ "stanko", "mislav", "ana"}));
    }*/
    Marathon m = new Marathon();
    String participant1[] = {"leo", "kiki", "eden"};
    String participant2[] = {"marina", "josipa", "nikola", "vinko", "filipa"};
    String participant3[] = {"mislav", "stanko", "mislav", "ana"};

    String completion1[] = {"eden", "kiki"};
    String completion2[] = {"marina", "josipa", "nikola", "filipa"};
    String completion3[] = {"stanko", "mislav", "ana"};


    @org.junit.Test
    public void marathon() {
        assertEquals("leo", m.marathon(participant1, completion1));
        assertEquals("vinko", m.marathon(participant2, completion2));
        assertEquals("mislav", m.marathon(participant3, completion3));
    }
}
