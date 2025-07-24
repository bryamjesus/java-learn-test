package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz
{

    public List<String> getNumbers()
    {
        return IntStream.rangeClosed(1, 101).mapToObj(n -> {
            Boolean isMultipleOf3 = n % 3 == 0;
            Boolean isMultipleOf5 = n % 5 == 0;
            if (isMultipleOf3 && isMultipleOf5)
            {
                return "FizzBuzz";
            }
            if (isMultipleOf3)
            {
                return "Fizz";
            }
            if (isMultipleOf5)
            {
                return "Buzz";
            }
            return String.valueOf(n);
        }).collect(Collectors.toList());
    }
}
