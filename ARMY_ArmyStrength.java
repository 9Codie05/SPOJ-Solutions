import java.util.Scanner;

/**
 * Created by poonamyadav on 21/07/17.
 */
public class ARMY_ArmyStrength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        sc.nextLine();
        while (t>0) {
            int ng, nm, maxNg = -1, maxNm = -1;
            ng = sc.nextInt();
            nm = sc.nextInt();
            sc.nextLine();
            int i = 0;
            int[] arrNg = new int[ng];
            int[] arrNm = new int[nm];
            for(i=0; i<ng; i++) {
                arrNg[i] = sc.nextInt();
                if(arrNg[i] > maxNg)
                    maxNg = arrNg[i];
            }
            sc.nextLine();
            for(i=0; i<nm; i++) {
                arrNm[i] = sc.nextInt();
                if(arrNm[i] > maxNm)
                    maxNm = arrNm[i];
            }
            if(maxNm > maxNg)
                System.out.println("MechaGodzilla");
            else
                System.out.println("Godzilla");
            t--;
        }
    }
}
