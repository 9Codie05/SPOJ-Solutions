import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by poonamyadav on 04/08/17.
 */
public class STAMPS_Stamps {
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        int o=1;
        while(t>0) {

            int n,f;
            n = sc.nextInt();
            f = sc.nextInt();
            sc.nextLine();
            int[] arr = new int[f];
            for(int i=0; i<f; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int l = f, sum=0, flag=0,count=0;
            for(int i=l-1; i>=0; i--) {
                sum = sum + arr[i];
                count++;
                if(sum >= n) {
                    System.out.println("Scenario #"+o+":");
                    System.out.println(count);
                    System.out.println();
                    flag=1;
                    break;

                }
            }
            if(flag==0) {
                System.out.println("Scenario #"+o+":");
                System.out.println("impossible");
                System.out.println();
            }
            if(o<=t)
                o++;
            sum=0;
            t--;
        }
    }
}
