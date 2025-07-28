public class NumberHashing {
    public static void main(String[] args) {
        // Number Hashing
        int[] arr = {5, 6, 5, 9, 6, 9, 5};
        int[] hashtable = new int[10];
        for(int num : arr){
            hashtable[num]++;
        }
        System.out.println(hashtable[5]);
    }
}
