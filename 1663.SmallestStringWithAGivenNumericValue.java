class Solution {
    public String getSmallestString(int n, int k) {
        char []arr=new char[n];
        Arrays.fill(arr,'a');
        k-=n;
        
        for(int i=arr.length-1;i>=0;i--)
        {
           if(k<=25)
           {
                arr[i]=(char)('a'+k);
                  break;
            }
            else
            {
                arr[i]='z';
                k=k-26+1;
            }
        }
       return(String.valueOf(arr));
       
    }
}
