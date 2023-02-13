// Alex Nouansacksy
// Prog408a
// 02/13/2023
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Prog408a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/prg408a.dat"));
            Cl408a[] list = new Cl408a[21];
            int cnt = 0;
            while (keyboard.hasNext()) {
                int id = keyboard.nextInt();
                int score = keyboard.nextInt();
                list[cnt] = new Cl408a(id, score);
                cnt++;
            }

            list = SortingAlgs.insertionSort(list);
            out.println("Id\tScore");
            for(int i = 0; i < list.length; i++) {
                out.println(list[i].getID() + "\t" + list[i].getScore());
            }
        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Id	Score
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223

Process finished with exit code 0

 */