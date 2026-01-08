package arrays;

import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            RemoveDuplicates rd = new RemoveDuplicates();

            int[] nums = {0,0,1,1,1,2,2,3,3,4};
            int k = rd.removeDuplicates(nums);

            System.out.println("k = " + k);
            System.out.println(Arrays.toString(nums));
        }
}
