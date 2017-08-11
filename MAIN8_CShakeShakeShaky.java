import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by poonamyadav on 16/07/17.
 */
/*public class MAIN8_CShakeShakeShaky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        sc.nextLine();
        while (t>0) {
            long n,k;
            n = sc.nextLong();
            k = sc.nextLong();
            sc.nextLine();
            long [] arr = new long[n];
            long i=0;
            for(i=0; i<n; i++) {
                arr[i] = sc.nextLong();
            }
            Arrays.sort(arr);
            MAIN8_CShakeShakeShaky ms = new MAIN8_CShakeShakeShaky();
            long res = ms.bs(arr, n, k);
            //int ans = arr[res]-arr[0];
            System.out.println(res);
            t--;
        }
    }

    int bs(long arr[], long n, long k) {
        long low=0, high = n-1, max=0;
        if(low==high) {
            max += arr[0]/k;
        }

        while(low < high) {
            long mid = (low+high)/2;
            if(func(arr[mid], arr, n, k) == 1) {
                if(arr[mid] > max)
                    max = arr[mid];
                low = mid+1;
            } else
                high=mid;
        }
        return max;
    }

    int func(long num, long [] arr, long n, long k) {
        long [] dest = new long [n];
        System.arraycopy(arr, 0, dest, 0, arr.length);
        long c=0;
        long i=0;
        for(i=n-1; i>=0; i--) {
            c += dest[i]/num;
            if(c >= k) return 1;
        }
        return 0;
    }
}*/
