public class SecondHighestOccurring {
    public static void main(String[] args) {
        /*
        Given an array of n integers, find the second most frequent element in it.
        If there are multiple elements that appear a maximum number of times, find the smallest of them.
        If second most frequent element does not exist return -1.
         */
        int[] arr = {1, 2, 2, 3, 3};
        System.out.println(secondMostFrequentElement(arr));
    }
    public static int secondMostFrequentElement(int[] nums) {
        int[] hash = new int[100000];

        // Count frequencies
        for (int num : nums) {
            hash[num]++;
        }

        int maxFreq = 0, secMaxFreq = 0;
        int mostFrequentElement = -1;
        int secondMostFrequentElement = -1;

        for (int i = 0; i < 100000; i++) {
            if (hash[i] > maxFreq) {
                secMaxFreq = maxFreq;
                secondMostFrequentElement = mostFrequentElement;
                maxFreq = hash[i];
                mostFrequentElement = i;
            } else if (hash[i] > secMaxFreq && hash[i] < maxFreq) {
                secMaxFreq = hash[i];
                secondMostFrequentElement = i;
            }
        }

        // No second most frequent element found
        return secondMostFrequentElement;


    }
}
