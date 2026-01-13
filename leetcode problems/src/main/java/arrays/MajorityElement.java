package arrays;

public class MajorityElement {
    public int majorityElement(int[] nums){
        int count =0;
        Integer candidate = null;
        for (int n: nums){
            if(count == 0){
                candidate = n;
            }
            if (candidate == n){
                count++;
            }
            else{
                count--;
            }
        }
        return candidate == null ? -1 : candidate;
    }
}
