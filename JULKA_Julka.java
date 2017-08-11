import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by poonamyadav on 11/08/17.
 */
public class JULKA_Julka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<10; i++) {
        BigInteger totalApples, excessApples, k, n;
        totalApples = sc.nextBigInteger();
        excessApples = sc.nextBigInteger();

            k = (totalApples.add(excessApples)).divide(BigInteger.valueOf(2));
            n = totalApples.subtract(excessApples).divide(BigInteger.valueOf(2));
            System.out.println(k);
            System.out.println(n);
        }

    }
}
