

class Solution {
    public void reorderList(ListNode head) {

        ListNode slow = head;       
        ListNode fast = head;

        while(fast!=null&& fast.next!=null){        //finding the middle of list
            slow = slow.next;
             fast = fast.next.next;
        }

        ListNode second = slow.next;                //split the List
        slow.next=null;

        ListNode previous = null;

        while(second!=null){                        //reversing the second list
           ListNode next = second.next;

            second.next=previous;

            previous= second;
            second=next;
        }

                //merge the two lists
            ListNode first = head;
             second= previous;

            while(second!=null){
                ListNode firstNext=first.next;
                ListNode secondNext = second.next;

                first.next=second;
                second.next=firstNext;

                first=firstNext;
                second=secondNext;
            }


        
    }
}
