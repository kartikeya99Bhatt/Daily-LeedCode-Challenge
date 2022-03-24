class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        
        int p1=0,p2=people.length-1;
        int CountBoat=0;
        
        // we are going to pick thin and heavy 
        while(p1<=p2)
        {
             if(people[p1]+people[p2]<=limit)
            {
                 // pick boath
                p1++;
                p2--;
            }
            else 
            {
                // pick to heavy
                p2--;
            }
            CountBoat++;
        }
        
        return CountBoat;
    }
}
