// Alex Nouansacksy
// Prog505a
// 01/03/2023

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog505a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog505a.dat"));
            List<Cl505a> list = new ArrayList<Cl505a>();
            while(keyboard.hasNext()) {
                String firstName = keyboard.next();
                String lastname = keyboard.next();
                int books = keyboard.nextInt();
                Cl505a wow = new Cl505a(firstName + " " + lastname, books);
                list.add(wow);
            }

            for(int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a cur = list.get(lcv);
                cur.calc();
            }

            for (Cl505a x : list) System.out.println(x);

            double tot = 0;
            for (Cl505a b : list) tot += b.getPoints();
            double average = tot / list.size();

            int bigPoints = list.get(0).getPoints();
            String bigName = list.get(0).getName();
            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a book = list.get(lcv);
                if (book.getPoints() > bigPoints) {
                    bigPoints = book.getPoints();
                    bigName = book.getName();
                }
            }
            out.println("\nAverage points: " + average);
            out.println("The Winner is: " + bigName);
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75

Average points: 63.0
The Winner is: K.C. Master

Process finished with exit code 0

 */