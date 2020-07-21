import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @Before
    public void before(){
        this.calculator = new Calculator();
    }

    @Test
    public void add(){
        assertEquals(11,this.calculator.add(5,6));
    }

    @Test
    public void subtract(){
        assertEquals(5,calculator.subtract(11,6));
    }

    @Test
    public void multiply(){
        assertEquals(24, calculator.multiply(4, 6));
    }

    @Test
    public void divide(){
        assertEquals(3.3333333333333335, calculator.divide(10.00000000, 3), 0.01);
    }
}
