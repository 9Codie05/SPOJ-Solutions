import java.util.Scanner;

/**
 * Created by poonamyadav on 23/07/17.
 */
public class FASHION_FashionShows {
    public static void quickSortInDescendingOrder (int[] numbers, int low, int high) {
        int i = low;
        int j = high;
        int temp;
        int middle=numbers[(low+high)/2];

        while (i<j) {
            while (numbers[i]>middle) {
                i++;
            }
            while (numbers[j]<middle) {
                j--;
            }
            if (j>=i) {
                temp=numbers[i];
                numbers[i]=numbers[j];
                numbers[j]=temp;
                i++;
                j--;
            }
        }
        if (low<j) {
            quickSortInDescendingOrder(numbers, low, j);
        }
        if (i<high) {
            quickSortInDescendingOrder(numbers, i, high);
        }
    }
    public static void main(String[] args) {
        int t;
        Scanner sc = new Scanner(System.in);
        t = sc.nextInt();
        sc.nextLine();
        while(t>0) {
            int n, max=0;
            n = sc.nextInt();
            int[] men = new int[n];
            int[] women = new int[n];
            for(int i=0; i<n; i++) {
                men[i] = sc.nextInt();
            }
            sc.nextLine();
            for(int i=0; i<n; i++) {
                women[i] = sc.nextInt();
            }
            FASHION_FashionShows.quickSortInDescendingOrder(men, 0, men.length-1);
            FASHION_FashionShows.quickSortInDescendingOrder(women, 0, men.length-1);
            for(int i = 0; i<n; i++) {
                max = max + men[i]*women[i];
            }
            System.out.println(max);
            t--;
        }
    }
}
