public class HighestOccurring {
    public static void main(String[] args) {
        /*
        Given an array of n integers, find the most frequent element in it i.e.,
        the element that occurs the maximum number of times.
        If there are multiple elements that appear a maximum number of times, find the smallest of them.
         */
        int[] nums = {4, 4, 5, 5, 6};

        System.out.println(mostFrequentElement(nums));
    }
    public static int mostFrequentElement(int[] nums) {
        int n = nums.length;

        int max = 0;

        int el = 0;

        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(visited[i]) continue;

            int count = 0;

            for(int j=0; j<n; j++){
                if(nums[i]==nums[j]){
                    count++;
                    visited[j] = true;
                }
            }

            if(count>max){
                max = count;
                el = nums[i];
            }else if(count == max){
                el = Math.min(el, nums[i]);
            }
        }
        return el;
    }
}
