import java.io.*;

/**
 * Created by poonamyadav on 11/08/17.
 */
public class FileReadingInJava {

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new FileReader("G:\\RoutePPAdvant2.txt"));
            String str;
            str = in.readLine();
            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            String lines[] = str.split("\\r?\\n");

            System.out.println(lines);
            in.close();
        } catch (IOException e) {
            System.out.println("File Read Error");
        }
    }

}
