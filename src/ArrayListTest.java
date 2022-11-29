// Alex Nouansacksy
// ArrayListTest
// 11/29/22
import java.util.*;
import static java.lang.System.out;
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        // ArrayList<Wrapper Type> varname = new ArrayList<WrapperTye>();

        for (int lcv = 0; lcv < 100; lcv ++) {
            int rand = (int) (Math.random() * 100) + 1;
            list.add(rand);
        }

        for (int lcv = 0; lcv < list.size(); lcv += 2)
            out.print(list.get(lcv) + " ");
        out.println();

        if (list.contains(50)) out.println("Does list contain 50? " + list.contains(50));
        out.println("Index of 50: " + list.indexOf(50));

        for (int i : list) out.println(i);
    }
}
