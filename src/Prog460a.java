// Alex Nouansacksy
// Prog460a
// 02/10/2022

import java.io.File;
import java.io.IOException;
import java.util.*;

import static java.lang.System.out;

public class Prog460a {
    public static void main(String[] args) {
        try {
            Scanner keyboard = new Scanner(new File("data/sort.dat"));
            int[] list = new int[60];
            int count = 0;
            while(keyboard.hasNext()) {
                list[count] = keyboard.nextInt();
                count++;
            }
            Arrays.sort(list);

            Scanner kbd = new Scanner(System.in);
            int num = 0;
            while(num != -1) {
                out.print("Enter a number to search for: ");
                num = kbd.nextInt();
                //int index = SearchAlgs.linearsearch(list, num);
                //int index = SearchAlgs.binarysearch(list, num);
                int index = SearchAlgs.binarySearchRec(list, num, 0, list.length -1);
                if (index == -1) out.println("Your number does not occur in this list");
                else out.println("Your number occurs at position: " + (index + 1));
            }

        } catch (IOException e) {
            out.println("Can't find data file!");
        }
    }
}
/*
Enter a number to search for: 92
Your number occurs at position: 53
Enter a number to search for: 110
Your number does not occur in this list
Enter a number to search for: 1
Your number occurs at position: 1
Enter a number to search for: -1
Your number does not occur in this list

Process finished with exit code 0


 */