// WAY 1
class Solution{
    
    // implements comparable
    class pair  implements Comparable<pair>
    {
        int val;
        int fq;
        pair(int val,int fq)
        {
            this.val=val;
            this.fq=fq;
        }
       public int compareTo(pair o)
        {
            return(o.fq-this.fq);
        }
    }
    
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap<Integer,Integer>fmap=new HashMap<>();
        // frequence
        for(int val:nums)
        {
            fmap.put(val,fmap.getOrDefault(val,0)+1);
        }
       
        // PriorityQueue<Pair>pq=new PriorityQueue<>((a,b)->{
        //     return(b.fq-a.fq);
        // });
        
        PriorityQueue<pair>pq=new PriorityQueue<>();
        
        for(int key:fmap.keySet()){
            pq.add(new pair(key,fmap.get(key)) );
        }
        int ans[]=new int[k];
        
        for(int i=0;i<k;i++)
        {
         
          pair temp=pq.remove();
            ans[i]=temp.val;
        }
        
        return ans;
    }
}




// WAY 2
class Solution {
    class pair
    {
        int val;
        int fq;
        pair(int val,int fq)
        {
            this.val=val;
            this.fq=fq;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>fmap=new HashMap<>();
        for(int val:nums)
        {
            fmap.put(val,fmap.getOrDefault(val,0)+1);
        }
        
        PriorityQueue<pair>pq=new PriorityQueue<>((a,b)->{
            return(b.fq-a.fq);
        });
        
        for(int key:fmap.keySet()){
            pq.add(new pair(key,fmap.get(key) ) );
        }
        int []ans=new int[k];
        for(int i=0;i<k;i++){
          pair temp=pq.remove();
            ans[i]=temp.val;
        }
        return ans;
    }
}

// WAY 3

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>fmap=new HashMap<>();
        for(int val:nums){
            fmap.put(val,fmap.getOrDefault(val,0)+1);
        }
        
        PriorityQueue<int[]>pq=new PriorityQueue<>((a,b)->{
            return(b[1]-a[1]); // decreasing order
        });
        
        for(int key:fmap.keySet()){
            int []arr=new int[2];
            arr[0]=key;
            arr[1]=fmap.get(key);
            pq.add(arr);
        }
        
        int []ans=new int[k];
        for(int i=0;i<k;i++){
            int []arr=pq.remove();
            ans[i]=arr[0];
        }
        return ans;
    }
}
