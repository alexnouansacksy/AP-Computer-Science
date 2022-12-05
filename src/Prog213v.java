// Alex Nouansacksy
// Prog213v
// 12/05/2022
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.out;

public class Prog213v {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<Transaction>();

            double balance = keyboard.nextDouble();
            Bank wow = new Bank(balance);

            String code = keyboard.next();
            while (!(code.equals("E"))) {
                double amount = keyboard.nextDouble();
                Transaction fred = new Transaction(code, amount);
                list.add(fred);
                code = keyboard.next();
            }

            for (int lcv = 0; lcv < list.size(); lcv++)
                wow.calc(list.get(lcv));
            out.println("The final balance is: $" + wow.getAmount());
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
The final balance is: $219.15

Process finished with exit code 0
 */