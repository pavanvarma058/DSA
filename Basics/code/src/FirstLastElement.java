public class FirstLastElement {
    public static void main(String[] args) {
        // Sum of first and last element in an array
        int[] arr = {1, 2, 3, 4, 8, 9};
        System.out.println(sumOfFirstAndLast(arr));;
    }
    public static int sumOfFirstAndLast(int[] arr){
        int sum = arr[0];
        sum += arr[arr.length-1];
        return sum;
    }
}
