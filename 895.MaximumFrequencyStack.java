class FreqStack {

   HashMap<Integer,Stack<Integer>>st;
   HashMap<Integer,Integer>fmap; 
    int maxValue;
    public FreqStack() {
        st=new HashMap<>();
        fmap=new HashMap<>();
        maxValue=Integer.MIN_VALUE;
    }
    
    public void push(int val) {
       if(fmap.containsKey(val)==true)
           fmap.put(val,fmap.get(val)+1);
           else
               fmap.put(val,1);
        
        int stNo=fmap.get(val);
        if(!st.containsKey(stNo))
        {
           st.put(stNo,new Stack<>());  
        }
        st.get(stNo).push(val);
        maxValue=Math.max(maxValue,stNo);
    }
    
    public int pop() {
        int ans = st.get(maxValue).pop();
        if(st.get(maxValue).size()==0)
        {
            st.remove(maxValue--);
        }
        int value=fmap.get(ans);
        fmap.put(ans,value-1);
        
    
        return ans;
    }
}

/**
 * Your FreqStack object will be instantiated and called as such:
 * FreqStack obj = new FreqStack();
 * obj.push(val);
 * int param_2 = obj.pop();
 */
