import javax.crypto.spec.PSource;



public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }

    // To insert new node to a list
    public void insertFirst(int val){
        Node node=new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    //INSERT FIRST

    public void insertLast(int val){
        Node node=new Node(val);
        tail.next=node;
        tail=node;
        if(head ==null){
            head=node;
        }
        size++;

    }

    //insert value at particular index

    public void insert(int index,int val){
        if(index==0){
           insertFirst(val);
           return;
        }
        if(index==size-1){
            insertLast(val);
            return;
        }

        Node temp=head;
        for (int i = 1; i < index; i++) {
            temp=temp.next;
        }

        Node node=new Node(val,temp.next);
//        Node prev=get(index-1);
//        prev.next=node;
//        node.next=prev.next.next;
        temp.next=node;
        size++;

    }

    //delete first
    public int deleteFirst(){
        int val=head.value;
        head =head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    //DELETE LAST

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }

    //delete particular index

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        Node prev=get(index-1);
        int val=prev.next.value;

        prev.next=prev.next.next;

        return val;
    }

    //CREATING get() FUNCTION TO GET NODE
    public Node get(int index){
        Node node=head;
        for(int i=0;i<index;i++){
            node=node.next;
        }
        return node;
    }

    //find node by value

    public Node find(int value){
        Node node=head;
        while(node!=null){
            if(node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }

    //to display the list
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.print("END");
    }

// creating linked list
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

        public static void main(String[] args) {
            LL list=new LL();
           list.insertFirst(19);
            list.insertFirst(45);
            list.insertFirst(97);
            list.insertFirst(71);
            list.insertFirst(22);
            list.insertLast(20);
            list.insert(2,2);
            list.display();
        }


}
