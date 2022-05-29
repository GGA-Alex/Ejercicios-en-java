package exercises;

import org.junit.Assert;
import org.junit.Test;

public class Exercises1Test {

    @Test
    public void checkFactorial()
    {
        Exercises1 exercise1 = new Exercises1();
        int result = 3628800;
        Assert.assertEquals(result, exercise1.factorial());
    }

    @Test
    public void checkEqualNumbers()
    {
        Exercises1 exercise2 = new Exercises1();
        Assert.assertEquals("2 and 2 are equals", exercise2.equalNumbers(2, 2));
        Assert.assertEquals("3 is greater than 2", exercise2.equalNumbers(2, 3));
        Assert.assertEquals("5 is greater than 3", exercise2.equalNumbers(5, 3));
        Assert.assertEquals("12 is greater than 10", exercise2.equalNumbers(12, 10));
    }

    @Test
    public void checkSumOfDigits()
    {
        Exercises1 exercise3 = new Exercises1();
        Assert.assertEquals(9, exercise3.sumOfDigits(27));
        Assert.assertEquals(1, exercise3.sumOfDigits(10));
        Assert.assertEquals(5, exercise3.sumOfDigits(32));
        Assert.assertEquals(21, exercise3.sumOfDigits(678));
        Assert.assertEquals(15, exercise3.sumOfDigits(456));
    }

    @Test
    public void checkStringToInt()
    {
        Exercises1 exercise4 = new Exercises1();
        Assert.assertEquals(10, exercise4.stringToInt("10"));
        Assert.assertEquals(20, exercise4.stringToInt("20"));
        Assert.assertEquals(30, exercise4.stringToInt("30"));
    }

    @Test
    public void checkIntToString()
    {
        Exercises1 exercise4 = new Exercises1();
        Assert.assertEquals("10", exercise4.intToString(10));
        Assert.assertEquals("20", exercise4.intToString(20));
        Assert.assertEquals("30", exercise4.intToString(30));
    }

    @Test
    public void primeNumber()
    {
        Exercises1 exercise5 = new Exercises1();
        Assert.assertEquals("2 3 5 7 ", exercise5.primeNumbers(10));
    }
}
