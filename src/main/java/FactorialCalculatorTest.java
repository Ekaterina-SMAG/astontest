import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FactorialCalculatorTest {
    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfZero() {
        assertEquals(1, calculator.factorial(0), "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5), "Факториал 5 должен быть 120");
        assertEquals(720, calculator.factorial(6), "Факториал 6 должен быть 720");
        assertEquals(5040, calculator.factorial(7), "Факториал 7 должен быть 5040");
    }

    @Test
    public void testFactorialOfOne() {
        assertEquals(1, calculator.factorial(1), "Факториал 1 должен быть 1");
    }
    
}
