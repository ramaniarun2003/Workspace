public class Sorting {

    public int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr; // Base case
        }

        int middle = arr.length / 2;
        int[] left = new int[middle];
        int[] right = new int[arr.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = arr[i];
        }
        for (int i = middle; i < arr.length; i++) {
            right[i - middle] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);

        return arr;
    }

    public void merge(int[] arr, int[] left, int[] right) {
        int l = 0;  // index for left sub-array
        int r = 0; // index for right sub-array
        int merged = 0;

        while (l < left.length && r < right.length) {
            if (left[l] <= right[r]) {
                arr[merged] = left[l];
                l++;
            } else {
                arr[merged] = right[r];
                r++;
            }
            merged++;
        }

        while (l < left.length) {
            arr[merged] = left[l];
            l++;
            merged++;
        }

        while (r < right.length) {
            arr[merged] = right[r];
            r++;
            merged++;
        }

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        swap(arr, i + 1, high);
        return i + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public int[] selectionSort(int[] arr, int n) {
        for (int i = 0; i <= n - 2; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallestIndex]) {
                    smallestIndex = j;
                }
            }
            swap(arr, i, smallestIndex);

        }

        return arr;
    }

    public int[] bubbleSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
        return arr;
    }

    public static void insertionSort(int[] numbers) {
        int j;
        for (int i = 1; i < numbers.length; ++i) {
            j = i;
            while (j > 0 && numbers[j] < numbers[j - 1]) {
                swap(numbers, j, j-1);
                --j;
            }
        }
    }
}
