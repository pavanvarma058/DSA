public class TraversingArray {
    public static void main(String[] args) {
        // Traversing through 1D array
        int[] arr = {2, 3, 5, 8, 15, 23, 35, 58};
        // To traverse through array we use for-loop
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        // Traverse through 2D array
        int[][] array = {
                {1, 5, 6, 8, 9},
                {2, 4, 8, 7, 15, 24},
        };
        // To traverse through 2D array we need to use nested for loops
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
