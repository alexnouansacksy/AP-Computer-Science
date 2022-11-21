// Alex Nouansacksy
// NumberCubeMain
// 11/21/2022
import static java.lang.System.out;
public class NumberCubeMain {
    public static int[] getCubeTosses(NumberCube cube, int numTosses) {
        // Static means ready at compile-time (i.e., we don't have to make an object to use the method/variable)
        // much like all of our math functions
        int[] tosses = new int[numTosses];
        for (int lcv = 0; lcv < numTosses; lcv++) {
            tosses[lcv] = cube.toss();
        }
        return tosses;
    }

    public static int getLongestRun(int[] values) {
        int max = 0;
        int maxIndex = -1;
        int current = 0;
        for (int lcv2 = 0; lcv2 < values.length - 1; lcv2++) {
            if (values[lcv2] == values[lcv2 + 1]) {
                current++;
            } else {
                if (current > max) {
                    max = current;
                    maxIndex = lcv2 - current;
                }
                current = 0;
            }
        }
        if (current > max) {
            max = current;
            maxIndex = values.length - current;
        }
        return maxIndex;
    }

    public static void main(String[] args) {
        NumberCube x = new NumberCube();
        int[] y = getCubeTosses(x, 18);
        for(int temp : y) {
            out.print(temp + " ");
        }
        out.println("\nLongest run: " + getLongestRun(y));
    }

}
