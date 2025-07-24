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
        Assert.assertEquals("Fizz", numberList.get(2));
        Assert.assertEquals("Fizz", numberList.get(5));
        Assert.assertEquals("Fizz", numberList.get(8));
        Assert.assertEquals("Fizz", numberList.get(11));
    }

    @Test
    public void should_returnFizz_whenAMultipleOf5Test()
    {
        FizzBuzz game = new FizzBuzz();
        List<String> numberList = game.getNumbers();
        Assert.assertEquals("Buzz", numberList.get(4));
        Assert.assertEquals("Buzz", numberList.get(9));
        Assert.assertEquals("Buzz", numberList.get(19));
        Assert.assertEquals("Buzz", numberList.get(24));
    }
}