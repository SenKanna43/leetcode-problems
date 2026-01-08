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
        }
}
