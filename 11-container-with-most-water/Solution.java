class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int maximum_area=0;
        while(left<right)
        {
        int area=Math.min(height[left],height[right])*(right-left);
        maximum_area=Math.max(area,maximum_area);
        {
            if(height[left]<height[right])
            {
            left++;
            }
        else
            {
            right--; 
            }
        }
        }
        return maximum_area;
    }
}
