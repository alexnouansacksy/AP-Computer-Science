// Alex Nouansacksy
// Prog702p
// 01/25/2023
package Prog702p;


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
/*
Hiccas's name is: Billy
Its special word is: Buckner
It's fur is worth: $3.25

Wallie's name is: Fred
It's special word is: Ballony
Wallie has taken: 28 steps

Beeper's name is : Nick
Its special word is: Cuccia
Beeper's word is: coolbeans

Hiccas's name is: Murray
Its special word is: Cox
It's fur is worth: $4.0

Hiccas's name is: Carly
Its special word is: Seifert
It's fur is worth: $2.58

Hiccas's name is: Elias
Its special word is: Smith
It's fur is worth: $3.22

Wallie's name is: Katy
It's special word is: Rumberger
Wallie has taken: 45 steps

Wallie's name is: Tanya
It's special word is: Barton
Wallie has taken: 78 steps

Wallie's name is: Casey
It's special word is: Bats
Wallie has taken: 97 steps

Wallie's name is: Brandon
It's special word is: Davis
Wallie has taken: 68 steps

Beeper's name is : Ingrid
Its special word is: Sink
Beeper's word is: superdude

Beeper's name is : Nico
Its special word is: Binge
Beeper's word is: attaway

Beeper's name is : Mike
Its special word is: Break
Beeper's word is: done

Hiccas's name is: Brad
Its special word is: Williamson
It's fur is worth: $2.75

Hiccas's name is: Lorenzo
Its special word is: Rapp
It's fur is worth: $2.55

The average value of the Hicca fur is: 3.06
The average number of steps taken by Wallies is 63.20
The average size of the Beepers words is: 7.25

The most common letter(s) in all the Beepers' words is: a e
Process finished with exit code 0

 */