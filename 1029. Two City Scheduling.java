*
Approch
STEP 1:

[10,20]= 10
[30,200]= 170
[400,50]= -350
[30,20]= -10

STEP2:
sorted:

[400,50]= -350
[30,20]= -10
[30,200]= 170
[10,20]= 10

step 3:

50+20+30+10=110
*/

class Solution {

public int twoCitySchedCost(int[][] costs) {
    
    Arrays.sort(costs,(a,b)->{
        return (b[0]-b[1])-(a[0]-a[1]);
        });
         
                int ans =0;
        for(int i=0;i<costs.length;i++)
        {
            // System.out.println(costs[i][0]+" "+costs[i][1]);
             if(i< costs.length/2)
             {
                 ans+=costs[i][1];
             }
            else
            {
                 ans+=costs[i][0];
            }
        }
                return ans;
}
}
