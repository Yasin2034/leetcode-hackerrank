
public class SearchRotatedSortedArray {
	
	/*
	 Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).

You are given a target value to search. If found in the array return its index, otherwise return -1.

You may assume no duplicate exists in the array.

Example:
    Input: nums = [4,5,6,7,0,1,2], target = 0
    Output: 4
	  
	 */

	public int search(int[] nums, int target) {
        int lf = 0;
        int ri = nums.length-1;
        int md;
        
        while(lf <= ri){
            md = (ri+lf)/2;
            if(nums[md] == target) return md;
            else if(nums[lf]<=nums[md]){
                if(nums[md]>= target && nums[lf]<= target){
                    ri=md;
                }
                else{
                    lf=md+1;
                }
            }
            else{
                if(nums[md] <= target && nums[ri]>= target){
                    lf=md;
                }
                else{
                    ri = md-1;
                }
            }
        }
        return -1;
    }
}
