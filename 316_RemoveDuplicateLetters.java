class Solution {
    public String removeDuplicateLetters(String s) {
        if(s.length()==1)
        {
            return s;
        }
        Stack<Character>st=new Stack<>();
        
        //count the character
        int []count=new int[26];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            count[ch-'a']++;
        }
        
        // wether the character already exit in a stack or not
        boolean []exit=new boolean[26];
        
        for(int i=0;i<s.length();i++)
        {
             char ch=s.charAt(i);
             count[ch-'a']--;
            if(i==0)
            {
                 exit[ch-'a']=true;
                 st.push(ch);
                
            }
            else if(exit[ch-'a']==false)
            {
                
               if(st.peek()>ch && count[st.peek()-'a']>0)
               {
                    while(st.size()>0 && st.peek()>ch && count[st.peek()-'a']>0)
                    {
                        exit[st.pop()-'a']=false;
                        
                    }
                     st.push(ch);
                     exit[ch-'a']=true;
               }
                else
                {
                     exit[ch-'a']=true;
                     st.push(ch);
                    
                } 
            }
        }
        // empty the stack
        String ans ="";
        String ans1="";
       while(st.size()>0)
       {
           ans +=st.pop();
       }
       
        for(int i=ans.length()-1;i>=0;i--)
        {
            ans1+=ans.charAt(i);
        }
        return ans1;
    }
}
