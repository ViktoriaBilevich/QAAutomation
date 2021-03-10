import org.testng.Assert;
import org.testng.annotations.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static jdk.nashorn.internal.objects.Global.NaN;

public class UnitTests {
    //a>0, b>0 проверить a+b
    @Test
    public void sumTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2, 3), 5, "Тестовый комментарий");
    }

    //a<0, b<0 проверить a+b
    @Test
    public void sumTest2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(-2, -3), -5);
    }

    //a>0, b<0 проверить a+b
    @Test
    public void sumTest3() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.sum(2, -3), -1);
    }

    @Test
    public void divTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.div(4, 2), 2);
    }

    @Test
    public void divTest2() {
        Calculator calc = new Calculator();
        Assert.assertThrows(java.lang.ArithmeticException.class, () -> calc.div(4, 0));
    }

    @Test
    public void divFractionalTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.divFractional(7.5, 2.5), 3);
    }

    @Test
    public void divFractionalTest2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.divFractional(-0.3, 2.5), -0.12);
    }

    @Test
    public void divFractionalTest3() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.divFractional(0.3, 0), Infinity);
    }

    @Test
    public void divFractionalTest4() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.divFractional(-0.3, 0), -Infinity);
    }

    @Test
    public void rootTest1() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.root(9), 3);
    }

    @Test
    public void rootTest2() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.root(-9) , NaN);
    }

    @Test
    public void rootTest3() {
        Calculator calc = new Calculator();
        Assert.assertEquals(calc.root(0), 0);
    }
}