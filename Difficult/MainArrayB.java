public class MainArrayB {

    public static void main(String[] args) {
        // Sample usage
        int[] arrayA = {1, 2, 3};
        int[] arrayB = {4, 5, 6};
        int[] concatenatedArray = concat(arrayA, arrayB);

        // Print the concatenated array
        for (int value : concatenatedArray) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Define the concat method outside the main method
    public static int[] concat(int[] arrayA, int[] arrayB) {
        int[] array = new int[arrayA.length + arrayB.length];
        for (int index = 0; index < arrayA.length; index++) {
            array[index] = arrayA[index];
        }
        for (int index = 0; index < arrayB.length; index++) {
            array[index + arrayA.length] = arrayB[index];
        }
        return array;
    }
}

