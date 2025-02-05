public class InsertionSortExample {
    public static void insertionSort(int[] arr) {
        for (int currentIndex = 1; currentIndex < arr.length; currentIndex++) {
            int currentElement = arr[currentIndex];

            int previousIndex = currentIndex - 1;

            while (previousIndex >= 0 && arr[previousIndex] > currentElement) {
                arr[previousIndex + 1] = arr[previousIndex];

                previousIndex--;
            }

            arr[previousIndex + 1] = currentElement;
        }
    }

    public static void printArray(int[] arr) {
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] unsortedArray = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Original Array:");
        printArray(unsortedArray);

        insertionSort(unsortedArray);

        System.out.println("Sorted Array:");
        printArray(unsortedArray);
    }
}