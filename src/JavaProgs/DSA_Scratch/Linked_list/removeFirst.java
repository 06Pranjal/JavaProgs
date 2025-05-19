package JavaProgs.DSA_Scratch.Linked_list;

public class removeFirst {
    public static class Node{
        Node next;
        int data;
    }
    public static class linkedList{
        Node head;
        Node tail;
        int size;

        public void remove(){
            if(size==0){
                System.out.println("List Empty");
            } else if (size==1) {
                head=tail=null;
            }
            else {
                head=head.next;
                size--;
            }
        }

        public void add(int val){
            Node temp = new Node();
            temp.data = val;
            temp.next = null;

            if (size == 0) {
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }


        public void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        linkedList list=new linkedList();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("list Before removal");
        list.display();
        list.remove();
        System.out.println("List after First Element removal");
        list.display();
    }
}
