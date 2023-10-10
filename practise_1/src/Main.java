import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Integer> primeDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        int i = 2;

        while (i * i <= n) {
            if (n % i == 0) {
                divisors.add(i);
                while (n % i == 0) {
                    n /= i;
                }
            }
            i++;
        }

        if (n > 1) {
            divisors.add(n);
        }

        return divisors;
    }

    public static void main(String[] args) {
        int n = 76;
        List<Integer> result = primeDivisors(n);
        System.out.println(result);
    }
}
