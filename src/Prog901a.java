// Alex Nouansacksy
// Prog901a
// 02/16/2023

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog901a {
    public static String reverseString(String s) {
        if (s.equals("")) return s;
        return (reverseString(s.substring(1)) + s.charAt(0));
    }

    public static void printFile(Scanner keyboard) {
        ArrayList<String> list = new ArrayList<String>();

        while (keyboard.hasNext()) {
            String test = keyboard.nextLine();
            String[] test2 = test.split(" ");
            for (String a : test2) list.add(a);
        }

        for (String a : list) {
            char[] b = a.toCharArray();
            if (Character.isUpperCase(b[0])) out.println();
            out.print(a + " ");
        }
        out.println("\n\nBackwards");

        for (int i = list.size(); i > 0; i--) {
            out.print(reverseString(list.get(i - 1)) + " ");

            char[] test = reverseString(list.get(i - 1)).toCharArray();
            if (Character.isUpperCase(test[test.length -1 ])) {
                out.println();
            }
        }

    }

    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prog512h.dat"));
            printFile(keyboard);
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

Backwards
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG
klis ro ocilac ti eB
klim sa etihw sa htolc nI
erar os wohs a ekam tahT
riaf nemow uoy ot liaH
srewolf fo sdleif neerg uoy dnA
srewob ydahs uoy ot liaH
seton yb sevael rebmun dluoW
staorht esohw sdrib uoy ot liaH
hgih erusaem sduolc thgirb hcihW
yks gninrom eht ot liaH
dne on sah gnidneps siH
dneirf taerg ym si nus ehT
dlog eht snwo taht eh tuB
dloh gnihton stekcop yM
lufituaeb dna dalg sgnihT
lla dna efil gninrom dooG

Process finished with exit code 0

 */