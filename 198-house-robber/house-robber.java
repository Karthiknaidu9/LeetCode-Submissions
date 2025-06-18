class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        for(int i=1;i<nums.length;i++){
            if(i!=1){
             nums[i]=Math.max(nums[i-1],nums[i-2]+nums[i]);
            }else{
                nums[i]=Math.max(nums[i-1],nums[i]);
            }
        }
        return nums[nums.length-1];
    }
}