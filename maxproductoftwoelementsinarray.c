class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int size=nums.size();
        for(int i=0;i<size;i++){
            for(int j=0;j<size-1;j++){
                if(nums[j]<nums[j+1]){
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return (nums[0]-1)*(nums[1]-1);
    }
};
