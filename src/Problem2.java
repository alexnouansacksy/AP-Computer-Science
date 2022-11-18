// THIS ONE IS CORRECT WOOOOOOO
import java.util.*;
import static java.lang.System.out;
public class Problem2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Input: ");
        String str = keyboard.nextLine();
        String[] things = str.split(" ");
        String[] notFound = new String[100];
        for (int i = 0; i < things.length - 1; i++) {
            for (int lcv = 0; lcv < things[i +1].length(); lcv++) {
                if (!things[0].contains(things[i + 1].substring(lcv, lcv + 1))) {
                    notFound[i] = things[i + 1];
                }
            }
        }
        out.print("Words not found: ");
        for (int lcv2 = 0; lcv2 < notFound.length; lcv2++) {
            if (notFound[lcv2] != null)
                out.print(notFound[lcv2] + " ");
        }

    }
}
