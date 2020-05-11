import java.util.HashMap;

public class TwoSum {
	
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<>();
        for(int i = 0 ; i<nums.length;i++){
            if(hash.containsKey(target-nums[i])){
                int arr[] = {hash.get(target-nums[i]),i};
                return arr;
            }
            hash.put(nums[i],i);
        }
        return null;
    }

}
