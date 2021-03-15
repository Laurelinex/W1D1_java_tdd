import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(10, calculator.add(8, 2));
    }

    @Test
    public void canSubstract() {
        assertEquals(6, calculator.substract(8, 2));
    }

    @Test
    public void canMultiply() {
        assertEquals(16, calculator.multiply(8, 2));
    }

    @Test
    public void canDivide() {
        assertEquals(4, calculator.divide(8, 2), 0.0);
    }
}
