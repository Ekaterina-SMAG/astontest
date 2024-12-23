import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(calculator.factorial(0), 1, "Факториал 0 должен быть 1");
    }

    @Test
    public void testFactorialOfPositiveNumbers() {
        Assert.assertEquals(calculator.factorial(5), 120, "Факториал 5 должен быть 120");
        Assert.assertEquals(calculator.factorial(6), 720, "Факториал 6 должен быть 720");
        Assert.assertEquals(calculator.factorial(7), 5040, "Факториал 7 должен быть 5040");
    }

    @Test
    public void testFactorialOfOne() {
        Assert.assertEquals(calculator.factorial(1), 1, "Факториал 1 должен быть 1");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialOfNegativeNumber() {
        calculator.factorial(-1);
    }
}
