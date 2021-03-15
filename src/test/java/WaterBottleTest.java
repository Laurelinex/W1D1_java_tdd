import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    WaterBottle waterBottle;

    @Before
    public void before() {
        waterBottle = new WaterBottle();
    }

    @Test
    public void hasVolume100() {
        assertEquals(100, waterBottle.getVolume(), 0.0);
    }

    @Test
    public void drinkRemoves10() {
        assertEquals(90, waterBottle.drink(), 0.0);
    }

    @Test
    public void emptySetsTo0() {
        assertEquals(0, waterBottle.empty(), 0.0);
    }

}
