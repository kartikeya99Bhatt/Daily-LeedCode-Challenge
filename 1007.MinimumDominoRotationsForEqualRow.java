class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
       
       int []poss=new int[] {tops[0],bottoms[0]};
        
       
        int minCount=Integer.MAX_VALUE;
        
        // uper wale array ma travel karne ka liya
        for(int i=0;i<poss.length;i++)
        {
            int moves=0;
            for(int j=0;j<tops.length;j++)
            {
                if(tops[j]!=poss[i] && bottoms[j]==poss[i] )
                {
                   moves++;
                    
                }        
                else if(tops[j]!=poss[i] && bottoms[j]!=poss[i])
                {
                    moves=Integer.MAX_VALUE;
                    break;
                }
            }
            minCount=Math.min(minCount,moves);
            
        }  
        
        // micha vala array ma move arme ka liya
        
         for(int i=0;i<poss.length;i++)
        {
            int moves=0;
            for(int j=0;j<bottoms.length;j++)
            {
               if(bottoms[j]!=poss[i] && tops[j]==poss[i] )
                {
                   moves++;
                   
                }        
                else if(bottoms[j]!=poss[i] && bottoms[j]!=poss[i])
                {
                    moves=Integer.MAX_VALUE;
                    break;
                }
            }
            minCount=Math.min(minCount,moves);
            
        }  
        
        return(minCount==Integer.MAX_VALUE?-1:minCount);
    }
}
