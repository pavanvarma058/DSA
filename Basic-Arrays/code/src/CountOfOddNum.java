public class CountOfOddNum {
    public static void main(String[] args) {
        /*
        Given an array of n elements. The task is to return the count of the number of odd numbers in the array.
         */
        int[] arr = {5, 8, 9, 12, 25, 48, 67, 69, 98, 79};
        System.out.println(countOdd(arr));
    }
    public static int countOdd(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                count++;
            }
        }
        return count;
    }
}
