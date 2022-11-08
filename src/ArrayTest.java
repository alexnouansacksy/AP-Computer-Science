import static java.lang.System.out;
public class ArrayTest {
    public static void main(String[] args) {
        int[] nums = new int[100];
        for (int lcv = 0; lcv < 100; lcv++)
            nums[lcv] = lcv++;

        for (int lcv = 0; lcv < 100; lcv++)
            out.print(nums[lcv] + " ");
        out.println();

        char[] hello = "Hello, world!".toCharArray();
        //  For-each Loop
        for (char x : hello) {
            out.print(x);
        }
        out.println();

        String[] words = {"hello", "world", "wow", "cool", "wowsers", "cool beans"};
        // for (String temp : words) { do stuff }
        for (int lcv = 0; lcv < words.length; lcv++) {
            out.println(words[lcv]);
        }
   }
}
