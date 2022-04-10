class Solution {
    public int calPoints(String[] ops) {
        
        Stack<Integer>st=new Stack<>();
        for(String ch:ops)
        {
            if(ch.equals("C")){
               st.pop(); 
            }
            else if(ch.equals("D")){
                st.push(2*st.peek());
            }
            else if(ch.equals("+")){
                int val=st.pop();
                int newVal=val+st.peek();
                st.push(val);
                st.push(newVal);
            }
            else{
                st.push(Integer.parseInt(ch));
            }
        }
        
        int ans=0;
        while(st.size()>0)
        {
            ans+=st.pop();
        }
        return ans;
    }
}
