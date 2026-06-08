package week1.day3;
class Solution {
    public int maxArea(int[] height) {
        int n= height.length;
        int left =0;
        int right = n-1;
        int maxWater = 0;

        while(left<right){
           int width = right -left;
           int h = Math.min(height[left],height[right]);
           int a = width*h;

           maxWater = Math.max(maxWater,a);

           if(height[left] < height[right]){
            left++;
           }
           else{
            right--;
           }
        }
        return maxWater;
    }
}