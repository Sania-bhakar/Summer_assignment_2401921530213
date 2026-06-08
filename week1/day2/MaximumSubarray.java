class Solution {
    public static int maxSubArray(int[] nums) {
       int cs = 0;
       int ms = Integer.MIN_VALUE;

       for(int i=0; i<nums.length; i++){
        cs = Math.max(nums[i], cs + nums[i]);

        ms = Math.max(cs,ms);
       } 
       return ms;
    }
    public static void main(String[] args){
       int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

       maxSubArray(nums);
    }
}