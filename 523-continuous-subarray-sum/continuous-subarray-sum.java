import java.util.*;

class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // Map remainder -> earliest index
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); // remainder 0 at index -1 (important for subarrays starting at 0)

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int rem = sum % k;

            if (map.containsKey(rem)) {
                if (i - map.get(rem) > 1) { 
                    return true; // subarray length at least 2
                }
            } else {
                map.put(rem, i); // store first index of this remainder
            }
        }
        return false;
    }
}
