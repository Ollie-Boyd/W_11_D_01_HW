import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterBottle;

    @Before
    public void before(){
        this.waterBottle = new WaterBottle(100);
    }

    @Test
    public void hasVolume(){
        assertEquals(100,waterBottle.getVolume());
    }

    @Test
    public void takeDrink(){
        waterBottle.takeDrink();
        assertEquals(90,waterBottle.getVolume());
    }

    @Test
    public void empty(){
        waterBottle.empty();
        assertEquals(0,waterBottle.getVolume());
    }

    @Test
    public void fill(){
        waterBottle.fill();
        assertEquals(100,waterBottle.getVolume());
    }
}

