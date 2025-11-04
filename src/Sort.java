public class Sort {
    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public void bubbleSort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        for (int i = 0; i < values.length - 1; i++) {
            for (int j = 0; j < values.length - i - 1; j++) {
                if (values[j] > values[j + 1]) {
                    swap(values, j, j + 1);
                }
            }
        }
    }

    public void selectionSort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        for (int i = 0; i < values.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < values.length; j++) {
                if (values[j] < values[min]) {
                    min = j;
                }
            }
            swap(values, i, min);
        }
    }

    public void insertionSort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }
        for (int i = 1; i < values.length - 1; i++) {
            int temp = values[i];
            int j = i;
            while (j > 0 && values[j - 1] > temp) {
                values[j] = values[j - 1];
                j--;
            }
            values[j] = temp;
        }
    }

    public void mergeSort(int[] values) {
        if (values == null || values.length == 0) {
            return;
        }

        int middle = values.length / 2;
        int[] left = new int[middle];
        int[] right = new int[values.length - middle];

        for (int i = 0; i < middle; i++) {
            left[i] = values[i];
        }
        for (int i = 0; i < values.length - middle; i++) {
            right[i] = values[middle + i];
        }

        mergeSort(left);
        mergeSort(right);

        int l = 0;
        int r = 0;
        for(int i = 0; i < values.length; i++) {
            if (r >= right.length || (l < left.length && left[l] < right[r])) {
                values[i] = left[l++];
            } else {
                values[i] = right[r++];
            }
        }
    }

    public void inPlaceQuickSort(int[] values, int left, int right) {
        if (left >= right) {
            return;
        }

        int pivotIndex = partition(values, left, right);

        inPlaceQuickSort(values, left, pivotIndex - 1);
        inPlaceQuickSort(values, pivotIndex + 1, right);
    }

    public int partition(int[] values, int leftBound, int rightBound) {
        int pivot = values[rightBound];
        int left = leftBound - 1;
        int right = rightBound;

        while(true) {
            while(left < rightBound && values[++left] < pivot) { ; }
            while(right > leftBound && values[--right] > pivot) { ; }
            if (left >= right) break;
            else {
                swap(values, left, right);
            }
        }
        swap(values, left, rightBound);
        return left;
    }
}
