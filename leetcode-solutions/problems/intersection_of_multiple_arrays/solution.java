import java.util.*;

class Solution {
    public List<Integer> intersection(int[][] nums) {
        // Start with first array elements
        Set<Integer> common = new HashSet<>();
        for (int num : nums[0]) {
            common.add(num);
        }

        // Intersect with each subsequent array
        for (int i = 1; i < nums.length; i++) {
            Set<Integer> currSet = new HashSet<>();
            for (int num : nums[i]) {
                currSet.add(num);
            }
            common.retainAll(currSet); // keep only common elements
        }

        // Convert to list and sort
        List<Integer> result = new ArrayList<>(common);
        Collections.sort(result);
        return result;
    }
}
