public class SortingAlgs {
    public static int[] bubbleSort(int[] array) {
        for (int lcv = 0; lcv < array.length; lcv++) {
            for (int lcv2 = 0; lcv2 < array.length - 1; lcv2++) {
                if (array[lcv2] > array[lcv2 + 1]) {
                    int temp = array[lcv2];
                    array[lcv2] = array[lcv2 + 1];
                    array[lcv2 + 1] = temp;
                }
            }
        }
        return array;
    }

    public static int[] selectionSort(int[] array) {
        return array;
    }
}
