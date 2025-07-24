package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz
{
    private static final int FIZZ_DIVISOR = 3;
    private static final int BUZZ_DIVISOR = 5;
    public static final String FIZZ = "Fizz";
    public static final String BUZZ = "Buzz";
    public static final String FIZZ_BUZZ = FIZZ + BUZZ;

    private static Boolean isMultipleOf(int number, int divisor)
    {
        return (number % divisor) == 0;
    }

    private static String transformNumber(int number)
    {
        Boolean isMultipleOf3 = isMultipleOf(number, FIZZ_DIVISOR);
        Boolean isMultipleOf5 = isMultipleOf(number, BUZZ_DIVISOR);
        if (isMultipleOf3 && isMultipleOf5)
        {
            return FIZZ_BUZZ;
        }
        if (isMultipleOf3)
        {
            return FIZZ;
        }
        if (isMultipleOf5)
        {
            return BUZZ;
        }
        return String.valueOf(number);
    }

    public List<String> getNumbers()
    {
        return IntStream.rangeClosed(1, 101).mapToObj(FizzBuzz::transformNumber)
                .collect(Collectors.toList());
    }
}
