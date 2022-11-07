// Alex Nouansacksy
// Prog213b
// 11/07/2022
import java.io.*;
import java.util.*;
import static java.lang.System.out;

public class Prog213b {
    public static void main(String[] args) {
    try {
        Scanner keyboard = new Scanner(new File("data/prog215a.dat"));

        Cl213b[] list = new Cl213b[1000];
        int cnt = 0;

        while (keyboard.hasNext()) {
            int quantity = keyboard.nextInt();
            Cl213b wow = new Cl213b(quantity);
            list[cnt] = wow;
            cnt++;
        }

        for (int lcv = 0; lcv < cnt; lcv++)
            list[lcv].calc();

        for (int lcv = 0; lcv < cnt; lcv++)
            out.println(list[lcv].toString());

    } catch (IOException e) {
        System.out.println("Can't find data file!");
    }
}
}
