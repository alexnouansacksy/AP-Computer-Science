public class Test3 {
    public static void main(String[] args) {
        String text = "beautiful bEAch".toLowerCase();
        // region BackwardForLoop
        for (int lcv = text.length(); lcv --> 0;) {
            String chr = text.substring(lcv, lcv + 1);
            if (chr.equals("a") || chr.equals("e") || chr.equals("i") || chr.equals("o") || chr.equals("u"))
                System.out.print(chr);
            else System.out.print(" ");
        }
        // endregion
        System.out.println();
    }
}

//   ae   u i uae