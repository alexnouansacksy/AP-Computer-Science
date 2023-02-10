public class SearchAlgs {
    public static int linearsearch(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) return i;
        }
        return -1;
    }

    public static int binarysearch(int[] array, int x) {
        int low = 0;
        int high = array.length - 1;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            if (array[mid] == x) return mid;
            if (array[mid] < x) low = mid+1;
            else high = mid-1;
        }
        return -1;
    }

    // Call with binarySearchRec(array, x, 0, array.length - 1);
    public static int binarySearchRec(int[] array, int x, int low, int high) {
        if (low > high) return -1;
        int mid = (low + high) / 2;
        if (array[mid] == x) return mid;
        else if (array[mid] > x) return binarySearchRec(array, x, low, mid-1);
        else return binarySearchRec(array, x, mid+1, high);
    }

}
