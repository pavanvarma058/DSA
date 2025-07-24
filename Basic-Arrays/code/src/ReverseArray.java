public class ReverseArray {
    public static void main(String[] args) {
        /*
        Given an array arr of n elements. The task is to reverse the given array.
         The reversal of array should be inplace.
         */
        int[] arr = {1, 2, 3, 4, 5};
        reverse1(arr, arr.length);
    }
    public static void reverse(int[] arr, int n) {
        int[] rev = new int[n];
        for(int i=0; i<n; i++){
            rev[n-i-1] = arr[i];
        }
        for(int i=0; i<n; i++){
            arr[i] = rev[i];
            System.out.print(arr[i] + " ");
        }

    }

    public static void reverse1(int[] arr, int n){
        int left = 0;
        int right = n-1;
        while(left < right){
            swap(arr, left, right);
            left++;
            right--;
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }

    private static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
