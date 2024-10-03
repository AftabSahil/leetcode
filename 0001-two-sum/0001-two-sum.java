class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int length=nums.length;
        int iterator_value=0;//starting index
        int[] result= new int[2];
        for(int i=0; i<length; i++ ){
            for(int j=i+1;j<length;j++){
                if (nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }
            }
        }
        return result;
        //logic is :nums[i]+num[other_index]=target_value
        //loop
    }
}