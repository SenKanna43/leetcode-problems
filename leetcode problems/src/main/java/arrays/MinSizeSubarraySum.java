package arrays;

public class MinSizeSubarraySum {
    public int minSubArrayLen(int[] nums, int target){
        int minLen = Integer.MAX_VALUE;
        int left = 0;
        int currSum = 0;
        for (int right = 0; right < nums.length; right++){
            currSum += nums[right];
            while(currSum >= target){
                minLen = Math.min(minLen, right - left + 1);
                currSum -= nums[left];
                left++;
            }
        }

        return minLen == Integer.MAX_VALUE ? 0: minLen;
    }

}
