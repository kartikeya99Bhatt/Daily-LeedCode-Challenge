class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        // forward
        ListNode front=head;
        for(int i=0;i<k-1;i++)
            front=front.next;
        
        // to backWard
        ListNode fast=head;
        ListNode slow=head;
        
        for(int i=0;i<k;i++)
        {
           fast=fast.next;
        }
        
        while(fast!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
     
        int temp=front.val;
        front.val=slow.val;
        slow.val=temp;
        
          return head;
    }
  
}
