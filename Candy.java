import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by poonamyadav on 20/07/17.
 */
public class Candy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        BigInteger n;
        t = sc.nextInt();
        sc.nextLine();
        while(t>0) {
            n = sc.nextBigInteger();
            BigInteger  sum = BigInteger.ZERO;
            BigInteger[] arr = new BigInteger[n.intValue()];
            for(BigInteger i = BigInteger.valueOf(0); i.compareTo(n) < 0; i=i.add(BigInteger.ONE)) {
                arr[i.intValue()] = sc.nextBigInteger();
                sum = (sum.add(arr[i.intValue()]));
            }
            if(sum.mod(n).compareTo(BigInteger.ZERO) == 0)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
    }
}
