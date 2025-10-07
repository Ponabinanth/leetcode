class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int negCount = 0;
        while (negCount < n && nums[negCount] < 0) {
            negCount++;
        }
        int posCount = 0;
        int i = n - 1;
        while (i >= 0 && nums[i] > 0) {
            posCount++;
            i--;
        }
        
        return Math.max(negCount, posCount);
    }
}
