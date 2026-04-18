package ch6_arrays;

public class BuiltInArray {
    public static void main(String[] args) {
        // Four ways to create 1D array
        // 1. Declare and initialise with the value
        int[] arr = {1, 2, 3, 4, 5, 6};

        // 2. Declare with the size on the same line
        int[] arr2 = new int[20];

        // 3. Declare and initialize on separate line
        int[] arr4;
        arr4 = new int[20];

        // 4. Declare with size and values
        int[] arr5 = new int[]{1, 2, 3, 4, 4, 5}; // note int[] arr5 = new int[6]{1, 2, 3, 4, 4, 5} is invalid because size is taken by the amount ot items in the array


        // Four ways to create 2D Arrays
        // 1. Declare and initialise with values
        int[][] arr2d = {{1, 2, 3}, {4, 5, 6}};

        // 2. Declare with size on the same line
        int[][] arr2d2 = new int[3][4]; // 3 rows, 4 columns

        // 3. Declare and initialize on separate line
        int[][] arr2d3;
        arr2d3 = new int[3][4];

        // 4. Declare with size and values
        int[][] arr2d4 = new int[][]{{1, 2, 3}, {4, 5, 6}};

    }
}
