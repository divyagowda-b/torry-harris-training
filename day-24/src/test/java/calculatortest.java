import org.junit.Assert;
import org.junit.Test;

public class calculatortest {

    @Test
    public void addTest() {
        calculator calculator = new calculator();
        Assert.assertEquals(6, calculator.add(2, 4));

    }
    @Test
    public void subTest() {
        calculator calculator = new calculator();
        Assert.assertEquals(6, calculator.sub(8, 4));

    }

    @Test
    public void mulTest() {
        calculator calculator = new calculator();
        Assert.assertEquals(6, calculator.mul(2, 4));

    }

    @Test
    public void divTest() {
        calculator calculator = new calculator();
        Assert.assertEquals(6, calculator.div(2, 4));

    }
}
