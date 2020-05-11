import java.util.HashMap;

/*
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].
 
 */

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
