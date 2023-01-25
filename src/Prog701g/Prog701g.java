// Alex Nouansacksy
// Prog701g
// 01/24/2022
package Prog701g;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.out;

public class Prog701g {public static void main(String[] args) {
    try {
        Scanner input = new Scanner(new File("data/prog701g.dat"));
        List<Person> list = new ArrayList<Person>();

        int num = input.nextInt();
        while (num != 99) {
            String f = input.next();
            String l = input.next();

            if (num == 1) {
                double g = input.nextDouble();
                Person p = new Student(f, l, g);
                list.add(p);
            } else if (num == 2) {
                int n = input.nextInt();
                Person p = new Teacher(f, l, n);
                list.add(p);
            } else if (num == 3) {
                String fav = input.next();
                Person p = new Admin(f, l, fav);
                list.add(p);
            }
            num = input.nextInt();
        }

        double tot = 0;
        int cnt = 0;
        int totalstudents = 0;
        String large = "";
        String sm = "asldkfjasldfkjaslfdkjsalfdjlsajfdlsajfdlsajfdsalkfdj;lsadkjfsakjfdsa;lkjfdalsfdk;lsakfdjslakdjfa;lkfdj;alsdfkjas;ldfja;lsdfkj;ldsafkja;sldfkjs;lfadkja;lsfdkjsafdj;laskfjdasfdj";

        for (Person x : list) {
            if (x instanceof Student) {
                tot += ((Student)x).getGPA();
                cnt++;
            }
            if (x instanceof Teacher) {
                totalstudents += ((Teacher)x).getNumStuds();
            }
            if (x instanceof Admin) {
                String xstring = ((Admin)x).getFavw();
                if (xstring.length() > large.length())
                    large = xstring;
                if (xstring.length() < sm.length())
                    sm = xstring;
            }
        }

        out.println("Average GPA: " + String.format("%.2f", (tot/cnt )));
        out.println("Total num of studnets taught: " + totalstudents);
        out.println("Smallest admin word: " + sm);
        out.println("Largest admin word: " + large);

    } catch (IOException e) {
        out.println("Can't find data file!");
    }
}
}
/*
Average GPA: 3.06
Total num of studnets taught: 316
Smallest admin word: done
Largest admin word: coolbeans

Process finished with exit code 0

 */