package kata.primefactors.zelark;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static List<Integer> generate(int number) {
        List<Integer> primes = new ArrayList<Integer>();

        int candidate = 2;
        while (number > 1) {
            while (number % candidate == 0) {
                primes.add(candidate);
                number /= candidate;
            }
            candidate++;
        }

        return primes;
    }
}
