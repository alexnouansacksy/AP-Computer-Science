// THIS ONE IS CORRECT BROSKI
import java.util.*;
import static java.lang.System.out;
public class Problem1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        out.print("Input: ");
        String str = keyboard.nextLine();
        String[] splitIt = str.split(" ");
        int[] nums = new int[splitIt.length];
        for (int i = 0; i < splitIt.length; i++) {
            nums[i] = Integer.parseInt(splitIt[i]);
        }
        int[] temps = new int[nums[0]];
        int[] days = new int[100];
        for (int lcv = 0; lcv < temps.length; lcv++) {
            temps[lcv] = nums[lcv + 1];
        }

        for (int lcv = 0; lcv < temps.length - 1; lcv++) {
            if(temps[lcv + 1] + 15 <= temps[lcv]) {
                days[lcv] = lcv + 2;
            }
        }
        int difference;
        boolean hasColdDays = false;
        for (int i = 0; i < temps.length; i++) {
            if (days[i] != 0) {
                difference = temps[i] - temps[i + 1];
                out.println("Temperature drop (" + difference + " degrees) on day " + days[i]);
                hasColdDays= true;
            }
        }
        if (hasColdDays == false) out.print("No cold days");

    }
}

