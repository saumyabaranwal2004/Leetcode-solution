class Solution {
    public void rotate(int[] nums, int k) {
       int i=0;
       k=k%nums.length;
       //k=k-arr.length;
       int j=nums.length-1;
       while(i<j) {
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
        i++;
        j--;
       }
       int l=0;
       int p=k-1;
       while(l<p){
        int temp=nums[l];
        nums[l]=nums[p];
        nums[p]=temp;
        l++;
        p--;
       }
       int o=k;
       int m=nums.length-1;
       while(o<m){
        int temp=nums[o];
        nums[o]=nums[m];
        nums[m]=temp;
        o++;
        m--;
       }
    }
}