class Solution {
    public int brokenCalc(int startValue, int target) {
        
        int count=0;
        while(target!=startValue)
        {
            if(startValue>target)
            {
                return(count+startValue-target);
            }
           else  if(target%2==0 && target+1!=startValue)
            {
                target/=2;
                count++;
            }
            else
            {
                target++;
                count++;
            }
        }
        return count;
    }
}
