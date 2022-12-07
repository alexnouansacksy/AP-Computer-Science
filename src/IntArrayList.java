// Alex Nouansacksy
// 12/07/2022
// MyArrayListLab
public class IntArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFAULT_SIZE = 16;

    public IntArrayList() {
        myArray = new int[DEFAULT_SIZE];
        mySize = 0;
        myCapacity = DEFAULT_SIZE;
    }

    private void doubleCapacity() {
        myCapacity *= 2;
        int[] temp = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv ++) {
            temp[lcv] = myArray[lcv];
            myArray = temp;
        }
    }

    private void halfCapacity() {
        myCapacity /= 2;
        int[] temp = new int[myCapacity];
        for (int lcv = 0; lcv < mySize; lcv ++) {
            temp[lcv] = myArray[lcv];
            myArray = temp;
        }
    }

    public void add (int num) {
        if (mySize + 1 == myCapacity) doubleCapacity();
        myArray[mySize] = num;
        mySize++;
    }

    public void remove (int index) {
        for (int lcv = index + 1; lcv < mySize; lcv++) {
            myArray[lcv - 1] = myArray[lcv];
        }
        mySize--;
        if (mySize <= (myCapacity * 0.25) ) halfCapacity();
    }

    //public int get(int index) return{myArray[index]};


}
