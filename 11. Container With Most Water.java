class Solution {
    public int maxArea(int[] height) {
        
        int i=0;
        int j=height.length-1;
        
        int waterArea=0;
        while(i<j)
        {
            int wirth=j-i;
            int ht=Math.min(height[i],height[j]);
            
            int temp=wirth*ht;
            if(temp>waterArea)
            {
                waterArea=temp;
            }
            
            if(height[i]<height[j])
            {
                i++;
            }
            else // when both are equal it does'nt watter we can increment (i) or decrement(j) it does'nt matter 
            {
                j--;
            }
        }
        return waterArea;
        
    }
}
