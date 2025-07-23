public class SumOfArrayElements {
    public static void main(String[] args) {
        /*
        Given an array arr of size n, the task is to find the sum of all the elements in the array.
         */
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(sum(arr));
    }
    public static int sum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
