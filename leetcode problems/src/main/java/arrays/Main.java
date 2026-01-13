package arrays;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            // LC 26
            RemoveDuplicates rd = new RemoveDuplicates();
            int[] nums1 = {0,0,1,1,1,2,2,3,3,4};
            int k1 = rd.removeDuplicates(nums1);
            System.out.println("LC26 k = " + k1);
            System.out.println(Arrays.toString(nums1));

            // LC 27
            RemoveElement re = new RemoveElement();
            int[] nums2 = {0,1,2,2,3,0,4,2};
            int k2 = re.removeElement(nums2, 2);
            System.out.println("LC27 k = " + k2);
            System.out.println(Arrays.toString(nums2));

            // LC 344
            ReverseString rs = new ReverseString();
            char[] s = {'h','e','l','l','o'};
            rs.reverseString(s);
            System.out.println("LC344 reversed string: " + Arrays.toString(s));

            // LC 283
            MoveZeroes mz = new MoveZeroes();
            int[] nums3 = {0,1,0,3,12};
            mz.moveZeroes(nums3);
            System.out.println("LC283 moved zeroes: " + Arrays.toString(nums3));

            // LC 125
            IsPalindrome vp = new IsPalindrome();
//          String str = "A man, a plan, a canal: Panama";
            String str = ".,";
            boolean isPalindrome = vp.isPalindrome(str);
            System.out.println("LC125 is palindrome: " + isPalindrome);

            //LC 167
            TwoSumII ts = new TwoSumII();
            int[] nums4 = {2,7,11,15};
            int target = 9;
            int[] twoSum = ts.twoSum(nums4,target);
            System.out.println("LC167 two sum II: " + Arrays.toString(twoSum));

            //LC 977
            SortedSquares ss = new SortedSquares();
            int[] nums5 = {-4,-1,0,3,10};
            int[] sortedSquares = ss.sortedSquares(nums5);
            System.out.println("LC977 sortedSquares: " + Arrays.toString(sortedSquares));

            //LC 643
            MaxAverageOne ma = new MaxAverageOne();
            int[] nums6 = {1,12,-5,-6,50,3};
            int k = 4;
            double findMaxAvg = ma.findMaxAverage(nums6, k);
            System.out.println("LC643 Max Avg I : " + findMaxAvg);

            //LC 219
            ContainsDuplicateTwo cd = new ContainsDuplicateTwo();
            int[] nums7 = {1,2,3,1};
            int k3 = 3;
            boolean containsNearbyDuplicate = cd.containsNearbyDuplicate(nums7, k3);
            System.out.println("LC219 Contains Duplicate: " + containsNearbyDuplicate);

            //LC 3
            LengthOfLongestSubstring ls = new LengthOfLongestSubstring();
            String s1 = "abcabcbb";
            int lengthOfLongestSubstring = ls.lengthOfLongestSubstring(s1);
            System.out.println("LC3 Longest sub string without repeating characters: " + lengthOfLongestSubstring);

            //LC 209
            MinSizeSubarraySum ms = new MinSizeSubarraySum();
            int[] nums8 = {2,3,1,2,4,3};
            int target1 = 7;
            int minSubArrayLen = ms.minSubArrayLen(nums8,target1);
            System.out.println("CL209 in subarray sum length: " + minSubArrayLen);

            //LC 242
            ValidAnagrams va = new ValidAnagrams();
            String str2 ="anagram";
            String str3 ="nagaram";
            boolean validAnagram = va.validAnagram(str2, str3);
            System.out.println("LC242 Valid Anagram: " + validAnagram );

            //LC 169
            MajorityElement me = new MajorityElement();
            int[] nums9 = {2,2,1,1,1,2,2};
            int majorityElement = me.majorityElement(nums9);
            System.out.println("LC129 Majority element: " + majorityElement);

            //LC 1
            TwoSum ts1 = new TwoSum();
            int[] nums10 = {2,7,11,15};
            int target2 = 9;
            int[] twoSum1 = ts1.twoSum(nums10, target2);
            System.out.println("LC1 two sum: " + Arrays.toString(twoSum1));

        }
}
