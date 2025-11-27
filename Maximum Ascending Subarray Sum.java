class Solution {
    public int maxAscendingSum(int[] nums) {
        int currSum=nums[0];
        int maxsum=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                currSum+=nums[i];
            }
            else{
                maxsum=Math.max(maxsum,currSum);
                currSum=nums[i];
              
            }
              maxsum = Math.max(maxsum, currSum);
        }
        return maxsum;
    }
}
