public class LL2_DLL {

  private  Node head;
//    Node tail;
//    int size;

    // to insert element at first
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    //Display D-Linked List

    public void display(){
        Node node=head;
        while(node!=null){
            System.out.print(node.value+" -> ");
            node=node.next;
        }
        System.out.println("END");
    }
    public void display_rev(){
        Node node=head;
        Node last=null;
        while(node!=null){
            last=node;
            node=node.next;
        }
        while(last!=null){
            System.out.print(last.value +" -> ");
            last=last.prev;
        }
        System.out.print("End");
        }

    private class Node{
        int value;
        Node next;
        Node prev;
        Node(int value){
            this.value=value;
        }
        Node(int value, LL2_DLL.Node next) {
            this.value = value;
            this.next = next;
        }
        Node(int value, LL2_DLL.Node next,LL2_DLL.Node prev) {
            this.value = value;
            this.next = next;
            this.prev=prev;
        }
    }

    public static void main(String[] args) {
        LL2_DLL list = new LL2_DLL();

        list.insertFirst(23);
        list.insertFirst(97);
        list.insertFirst(71);
        list.insertFirst(88);
        list.insertFirst(19);
        list.display();
        list.display_rev();
    }
}
