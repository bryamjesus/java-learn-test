package tdd;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

public class FizzBuzzTest
{
    FizzBuzz game;

    @Before
    public void before()
    {
        game = new FizzBuzz();
    }

    @Test
    public void should_returnNumbers_whenNotAMultipleOf3Or5Test()
    {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("1", numberList.get(0));
        Assert.assertEquals("2", numberList.get(1));
        Assert.assertEquals("7", numberList.get(6));
        Assert.assertEquals("13", numberList.get(12));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf3Test()
    {
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FizzBuzz.FIZZ, numberList.get(2));
        Assert.assertEquals(FizzBuzz.FIZZ, numberList.get(5));
        Assert.assertEquals(FizzBuzz.FIZZ, numberList.get(8));
        Assert.assertEquals(FizzBuzz.FIZZ, numberList.get(11));
    }

    @Test
    public void should_returnBuzz_whenAMultipleOf5Test()
    {
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FizzBuzz.BUZZ, numberList.get(4));
        Assert.assertEquals(FizzBuzz.BUZZ, numberList.get(9));
        Assert.assertEquals(FizzBuzz.BUZZ, numberList.get(19));
        Assert.assertEquals(FizzBuzz.BUZZ, numberList.get(24));
    }

    @Test
    public void should_returnFizzBuzz_whenAMultipleOf3Or5Test()
    {
        List<String> numberList = game.getNumbers();
        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ, numberList.get(14));
        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ, numberList.get(29));
        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ, numberList.get(44));
        Assert.assertEquals(FizzBuzz.FIZZ_BUZZ, numberList.get(59));
    }
}