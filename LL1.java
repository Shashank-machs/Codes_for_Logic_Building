public class LL1 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode add_two_num(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode();
        ListNode res=dummy;
        int total=0,carry=0;

        while(l1!=null || l2!=null || carry!=0){
            total=carry;
            if(l1!=null){
                total+=l1.val;
                l1=l1.next;
            }
            if(l2!=null){
                total+=l2.val;
                l2=l2.next;
            }

            int num=total%10;
            carry=total/10;
            dummy.next=new ListNode(num);
            dummy=dummy.next;

        }
        return res.next;
  }

    public static void main(String[] args) {
        LL1 ll = new LL1();

        // Create two test linked lists
        ListNode l1 = ll.new ListNode(2, ll.new ListNode(4, ll.new ListNode(3)));
        ListNode l2 = ll.new ListNode(5, ll.new ListNode(6, ll.new ListNode(4)));

        // Add the two numbers
        ListNode result = ll.add_two_num(l1, l2);

        // Print the result linked list
        System.out.print("Result: ");
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) {
                System.out.print(" -> ");
            }
            result = result.next;
        }
        System.out.println(); // To ensure the output ends with a newline
    }

}
