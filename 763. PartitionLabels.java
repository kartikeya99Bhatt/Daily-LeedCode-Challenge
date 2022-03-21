class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer>list=new ArrayList<Integer>();
        HashMap<Character,Integer>idxMap=new HashMap<>();
        
        // last index store karne h 
        for(int i=0;i<s.length();i++)
        {
           idxMap.put(s.charAt(i),i);
        }

        int i=0;
        while(i<s.length())
        {
            int count=0;
            int last=idxMap.get(s.charAt(i));
            for(int j=i;j<=last;j++)
            {
                count++;
                if(idxMap.get( s.charAt(j) ) > last)
                {
                    last=idxMap.get(s.charAt(j));
                }
            }
            list.add(count);
            i=last+1;
        }
        return list;
    }
}
