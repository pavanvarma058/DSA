public class ArraySorted {
    public static void main(String[] args) {
        /*
        Given an array arr of size n, the task is to check if the given
        array is sorted in (ascending / Increasing / Non-decreasing) order.
        If the array is sorted then return True, else return False.
         */
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(arraySortedOrNot(arr, n));
    }
    public static boolean arraySortedOrNot(int[] arr, int n){
        for(int i=1; i<n; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
