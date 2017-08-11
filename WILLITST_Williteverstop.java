    import java.util.Scanner;

    /**
     * Created by poonamyadav on 11/08/17.
     */
    public class WILLITST_Williteverstop {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n;
            n = sc.nextInt();
            while(n > 1) {
                if(n%2!=0) {
                    System.out.println("NIE");
                    break;
                }

                if(n%2 == 0)
                    n = n/2;
                else
                    n = n*3 + 3;
            }
            if(n<=1){
                System.out.println("TAK");
            }

        }
    }
