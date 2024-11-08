/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode nod=head,ind=head,last=head;
        Stack<ListNode> stk=new Stack<>();
        Stack<ListNode> st=new Stack<>();
        st.add(null);
        while(nod!=null&&ind!=null){
            int val=k;
            while(val!=0&&nod!=null){
                stk.add(nod);
                nod=nod.next;
                ind=ind.next;
                val--;            
            }
            if(val==0){
                last=ind;
            nod=ind;
            st.add(reverse(stk));
            }
        }
        ListNode f=st.pop();
        ListNode add;
        ListNode nav;
        while(!st.isEmpty()){
            add=st.pop();
            if(add==null){
                continue;
            }
            nav=add;
            while(add.next!=null){
                // System.out.print(add.val+" ");
                add=add.next;
            }
            // System.out.println();
            add.next=f;
            f=nav;
        }
        ListNode t=f;
        while(t.next!=null){
            t=t.next;
        }
        t.next=last;
        // System.out.println(last.val);
        // f.next=ind;
        return f;
    }
    public static ListNode reverse(Stack<ListNode> stk) {
        ListNode curr=stk.pop();
        ListNode st=curr;
        while(!stk.isEmpty()){
            curr.next=stk.pop();
            // System.out.print(curr.val+" ");
            curr=curr.next;
        }
        // curr=curr.next;
        curr.next=null;
        return st;
    }
}
