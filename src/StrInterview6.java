// Alex Nouansacksy
// 09/28/2022
// String Interview 6
import java.util.*;
public class StrInterview6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String mytext = keyboard.nextLine();
        mytext = mytext.toLowerCase().trim();


        int Acount = 0;
        int Bcount = 0;
        int Ccount = 0;
        int Dcount = 0;
        int Ecount = 0;
        int Fcount = 0;
        int Gcount = 0;
        int Hcount = 0;
        int Icount = 0;
        int Jcount = 0;
        int Kcount = 0;
        int Lcount = 0;
        int Mcount = 0;
        int Ncount = 0;
        int Ocount = 0;
        int Pcount = 0;
        int Qcount = 0;
        int Rcount = 0;
        int Scount = 0;
        int Tcount = 0;
        int Ucount = 0;
        int Vcount = 0;
        int Wcount = 0;
        int Xcount = 0;
        int Ycount = 0;
        int Zcount = 0;

        for (int lcv = 0; lcv < mytext.length(); lcv++) {
            char cur = mytext.charAt(lcv);
            if (cur == 'a') Acount++;
            if (cur == 'b') Bcount++;
            if (cur == 'c') Ccount++;
            if (cur == 'd') Dcount++;
            if (cur == 'e') Ecount++;
            if (cur == 'f') Fcount++;
            if (cur == 'g') Gcount++;
            if (cur == 'h') Hcount++;
            if (cur == 'i') Icount++;
            if (cur == 'j') Jcount++;
            if (cur == 'k') Kcount++;
            if (cur == 'l') Lcount++;
            if (cur == 'm') Mcount++;
            if (cur == 'n') Ncount++;
            if (cur == 'o') Ocount++;
            if (cur == 'p') Pcount++;
            if (cur == 'q') Qcount++;
            if (cur == 'r') Rcount++;
            if (cur == 's') Scount++;
            if (cur == 't') Tcount++;
            if (cur == 'u') Ucount++;
            if (cur == 'v') Vcount++;
            if (cur == 'w') Wcount++;
            if (cur == 'x') Xcount++;
            if (cur == 'y') Ycount++;
            if (cur == 'z') Zcount++;



        }
        int unique = 0;

        if (Acount > 0) unique++;
        if (Bcount > 0) unique++;
        if (Ccount > 0) unique++;
        if (Dcount > 0) unique++;
        if (Ecount > 0) unique++;
        if (Fcount > 0) unique++;
        if (Gcount > 0) unique++;
        if (Hcount > 0) unique++;
        if (Icount > 0) unique++;
        if (Jcount > 0) unique++;
        if (Kcount > 0) unique++;
        if (Lcount > 0) unique++;
        if (Mcount > 0) unique++;
        if (Ncount > 0) unique++;
        if (Ocount > 0) unique++;
        if (Pcount > 0) unique++;
        if (Qcount > 0) unique++;
        if (Rcount > 0) unique++;
        if (Scount > 0) unique++;
        if (Tcount > 0) unique++;
        if (Ucount > 0) unique++;
        if (Vcount > 0) unique++;
        if (Wcount > 0) unique++;
        if (Xcount > 0) unique++;
        if (Ycount > 0) unique++;
        if (Zcount > 0) unique++;
        System.out.println(unique);

    }
}
/*
Enter a string: Java
3
*/