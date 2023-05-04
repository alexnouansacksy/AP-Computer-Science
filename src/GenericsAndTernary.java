import static java.lang.System.out;
public class GenericsAndTernary {
    // Generic Typing
    static class MyBox<T> {
        private T myVal;
        public MyBox (T thing) {myVal = thing;}
        public void setVal(T thing) {myVal = thing;}
        public T getVal() {return myVal;}
    }

    public static void main(String[] args) {
        // ArrayList<TYPE> list = new ArrayList<TYPE>();
        var box = new MyBox<Integer>(5);
        String msg = (box.getVal() >= 5) ? "val >= 5" : "val < 5";
        // Ternary Operator -> (condition) "if" ... "else" ...
        out.println(msg);
        box.setVal(10);
        out.println(box.getVal());
        // box.setVal("Hello");
        var sBox = new MyBox<String>("hello");
        out.println(sBox);
        // ONLY EVER USE "var" IF YOU USE THE "new" KEYBOARD
        // AND THE TYPE I SNOT A CHILD CLASS
    }
}
