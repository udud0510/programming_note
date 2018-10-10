import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CamouflageTest {
    Camouflage cf = new Camouflage();
    String c1[][] = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
    String c2[][] = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};

    @Test
    public void 테스트() {
        assertEquals(5, cf.camouflage(c1));
        assertEquals(3, cf.camouflage(c2));
    }
}


