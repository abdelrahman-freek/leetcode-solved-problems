package integer.fizzBuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz(5));
    }

    public static List<String> fizzBuzz(int n) {
        if (n < 1)
            return null;
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                result.add("FizzBuzz");
            else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else
                result.add(String.valueOf(i));
        }
        return result;
    }
}
