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
            String str = "A man, a plan, a canal: Panama";
            boolean isPalindrome = vp.isPalindrome(str);
            System.out.println("LC125 is palindrome: " + isPalindrome);
        }
}
