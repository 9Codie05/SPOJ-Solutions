import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class SmallFactorials
{
    public static void main (String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t>0) {
            BigInteger n, i;
            n = sc.nextBigInteger();
            if(sc.hasNextLine())
                sc.nextLine();
            BigInteger res = fact(n);
            System.out.println(res);
            t--;
        }

    }
    public static BigInteger fact(BigInteger n) {
        if(n.compareTo(BigInteger.ZERO) == 0 )
            return (BigInteger.valueOf(1));
        else if(n.compareTo(BigInteger.ONE) == 0)
            return (BigInteger.valueOf(1));
        else
            return n.multiply(fact(n.subtract(BigInteger.ONE)));

    }
}