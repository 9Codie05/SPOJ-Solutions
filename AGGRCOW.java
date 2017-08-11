import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by poonamyadav on 13/07/17.
 */



public class AGGRCOW {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t>0) {
            int n,c;
            n = sc.nextInt();
            c = sc.nextInt();
            sc.nextLine();
            int [] arr = new int[n];
            int i=0;
            for(i=0; i<n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            AGGRCOW ac = new AGGRCOW();
            int res = ac.returnDistance(arr, n, c);
            //int ans = arr[res]-arr[0];
            System.out.println(res);
            t--;
        }
    }

    int returnDistance(int arr[], int n, int c) {
        int low=0, high = arr[n-1], max=-1;
        while(low < high) {
            int mid = (low+high)/2;
            if(func(mid, arr, n, c) == 1) {
                if(mid>max)
                    max=mid;
                low = mid+1;
            } else
                high=mid;
        }
        return max;
    }

    int func(int num, int[] arr, int n, int c) {
        int pos = arr[0];
        int cow=1;
        int i=0;
        for(i=1; i<n; i++) {
            if(arr[i]-pos >= num) {
                pos = arr[i];
                cow++;
                if(cow==c)
                    return 1;

            }
        }
        return 0;
    }

}
