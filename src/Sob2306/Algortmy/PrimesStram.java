package Sob2306.Algortmy;
/*
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimesStram {
    public static List<Integer> primeNumbersTill(int n) {
        return IntStream.rangeClosed(2, n)
                .filter(x -> isPrime(x)).boxed()
                .collect(Collectors.toList());
    }
    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number)))
                .filter(n -> (n & 0X1) != 0)
                .allMatch(n -> x % n != 0);
    }
}*/

// http://www.baeldung.com/java-generate-prime-numbers