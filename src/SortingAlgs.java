import java.util.ArrayList;

public class SortingAlgs {
    public static int[] bubbleSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) min = j;
            }
            int temp = array[i];
            array [i] = array[min];
            array[min] = temp;
        }
        return array;
    }

    public static int[] insertionSort(int[] array) {
        for(int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j +1] = temp;
        }
        return array;
    }

    public static Cl408a[] insertionSort(Cl408a[] array) {
        for(int i = 1; i < array.length; i++) {
            Cl408a temp = array[i];
            int j = i - 1;
            while (j >= 0 && array[j].getScore() < temp.getScore()) {
                array[j + 1] = array[j];
                j--;
            }
            array[j +1] = temp;
        }
        return array;
    }

    public static ArrayList<Cl295c> insertionSort(ArrayList<Cl295c> array) {
        for(int i = 1; i < array.size(); i++) {
            Cl295c temp = array.get(i);
            int j = i - 1;
            while (j >= 0 && array.get(j).getIntSSN() > temp.getIntSSN()) {
                array.set(j + 1, array.get(j));
                j--;
            }
            array.set(j + 1, temp);
        }
        return array;
    }
}
