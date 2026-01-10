package arrays;

public class MaxAverageOne {
    public double findMaxAverage(int[] nums, int k) {
        int currentMax = 0;
        for (int i = 0 ; i < k; i++){
            currentMax += nums[i];
        }

        int maxSum = currentMax;

        for (int i = k; i < nums.length; i++){
            currentMax += nums[i];
            currentMax -= nums[i - k];
            maxSum = Math.max(maxSum, currentMax);
        }

        return (double) maxSum / k;
    }
}
