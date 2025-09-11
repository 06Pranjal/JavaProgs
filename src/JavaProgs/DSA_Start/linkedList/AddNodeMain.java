package JavaProgs.DSA_Start.linkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class AddNode {
    Node head;

    public void addFront(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
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

public class AddNodeMain {
    public static void main(String[] args) {
        AddNode list = new AddNode();
        list.addFront(10);
        list.addFront(20);
        list.addFront(30);

        list.display();
    }
}
