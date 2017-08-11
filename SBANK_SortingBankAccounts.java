import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Created by poonamyadav on 20/07/17.
 */
public class SBANK_SortingBankAccounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t>0) {
            int n, i, val;
            n = sc.nextInt();
            sc.nextLine();
            Map<String, Integer> acctInfo = new HashMap<String, Integer>();
            for(i=0; i<n; i++) {
                String str = sc.nextLine();

                if(!acctInfo.containsKey(str))
                    acctInfo.put(str, 1);
                else {
                    val = acctInfo.get(str);
                    val++;
                    acctInfo.put(str, val);
                }
            }

            Map<String, Integer> treeMap = new TreeMap<String, Integer>(acctInfo);

            printMap(treeMap);
            t--;
        }
    }

    public static <String, Integer> void printMap(Map<String, Integer> treeMap) {
        for(Map.Entry<String, Integer> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " value is: " + entry.getValue());
        }
    }
}
