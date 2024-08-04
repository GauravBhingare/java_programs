package abc;

public class nums {
    static class Solution {
        public int[] buildArray(int[] nums) {
            int[] arr = new int[nums.length];
            int i;
            for (i = 0; i < nums.length; i++) {
                arr[i] = arr[arr[i]];
            }
            return arr;
        }
    }
}
