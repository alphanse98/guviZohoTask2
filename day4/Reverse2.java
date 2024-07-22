public class Reverse2 {
    // Input: head = [1,2,3,4,5]
    // Output: [5,4,3,2,1]

    public ListNode reverseList(ListNode head) {
        ListNode node = null;

        while (head != null) {
            ListNode temp = head.next;
            head.next = node;
            node = head;
            head = temp;
        }

        return node;        
    }
}
