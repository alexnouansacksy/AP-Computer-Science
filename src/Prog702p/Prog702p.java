// Alex Nouansacksy
// Prog702p
// 01/25/2023
package Prog702p;

import Prog701g.Admin;
import Prog701g.Person;
import Prog701g.Student;
import Prog701g.Teacher;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

import static java.lang.System.out;

public class Prog702p {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog701g.dat"));
            ArrayList<Animal> list = new ArrayList<Animal>();

            int num = keyboard.nextInt();
            while (num != 99) {
                String f = keyboard.next();
                String l = keyboard.next();

                if (num == 1) {
                    double g = keyboard.nextDouble();
                    Animal p = new Hiccas(f, l, g);
                    list.add(p);
                } else if (num == 2) {
                    int n = keyboard.nextInt();
                    Animal p = new Wallies(f, l, n);
                    list.add(p);
                } else if (num == 3) {
                    String fav = keyboard.next();
                    Beepers p = new Beepers(f, l, fav);
                    list.add(p);
                }
                num = keyboard.nextInt();
            }

            double fursum = 0;
            double hiccas = 0;
            double stepssum = 0;
            double wallies = 0;
            double wordssum = 0;
            double beepers = 0;
            String letters = "";

            for (Animal a : list) {
                if (a instanceof  Hiccas) {
                    out.println("Hiccas's name is: " + a.getName());
                    out.println("Its special word is: " + a.getWord());
                    out.println("It's fur is worth: $" + ((Hiccas) a).getValue());
                    fursum += ((Hiccas) a).getValue();
                    hiccas++;
                } else if (a instanceof Wallies) {
                    out.println("Wallie's name is: " + a.getName());
                    out.println("It's special word is: " + a.getWord());
                    out.println("Wallie has taken: " + ((Wallies) a).getNumSteps() + " steps");
                    stepssum += ((Wallies) a).getNumSteps();
                    wallies++;
                } else if (a instanceof Beepers) {
                    out.println("Beeper's name is : " + a.getName());
                    out.println("Its special word is: " + a.getWord());
                    out.println("Beeper's word is: " + ((Beepers) a).getSpecialWord());
                    wordssum += ((Beepers) a).getSpecialWord().length();
                    letters = letters + ((Beepers) a).getSpecialWord();
                    beepers++;
                }
                out.println();
            }


            out.println("The average value of the Hicca fur is: " + String.format("%.2f", (fursum / hiccas)));
            out.println("The average number of steps taken by Wallies is " + String.format("%.2f", (stepssum / wallies)));
            out.println("The average size of the Beepers words is: " + String.format("%.2f", (wordssum / beepers)));

            int[] cnt = new int[26];
            String alphabet = ("abcdefghijklmnopqrstuvwxyz");
            for (int i = 0; i < letters.length(); i++) {
                for (int j = 0; j < alphabet.length(); j++) {
                    if (letters.substring(i, i + 1).equals(alphabet.substring(j, j + 1))) cnt[j]++;
                }
            }

            int max = cnt[0];
            for (int i : cnt) {
                if (i > max) max = i;
            }

            out.print("\nThe most common letter(s) in all the Beepers' words is: ");
            for (int i = 0; i < cnt.length; i ++) {
                if (cnt[i] == max) {
                    out.print(alphabet.substring(i, i + 1) + " ");
                }
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
