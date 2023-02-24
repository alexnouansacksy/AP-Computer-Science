// Alex Nouansacksy
// Prog901a
// 02/16/2023

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;
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