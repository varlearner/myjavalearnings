package src.com.learnjava;

public class CustomLinkedList {
    private Node head;

    public CustomLinkedList() {
        this.head = null;
    }

    public void add(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;

    }

    public void addNewNode(int data, int prevNodeData){

        Node current = head;

        while (current != null && current.next != null) {

            if(current.data == prevNodeData){

                Node newNode = new Node(data);
                Node temp = current.next;
                current.next = newNode;
                newNode.next = temp;
                break;

            }
           current = current.next;
        }

    }
    public void remove(int data) {
        Node current = head;
        Node prev = null;

        //if the element to be removed is at the head
        if (current != null && current.data == data) {
            head = current.next;
            return;
        }

        //Search for the element to be removed
        while (current != null && current.data != data) {
            prev = current;
            current = current.next;
        }

        //if the element is not present
        if (current == null) {
            return;
        }

        //unlink the node from the linked list
        prev.next = current.next;
    }


    public void display(){
        Node current = head;
        while(current != null){
            System.out.print(current.data + "   ");
            current = current.next;
        }
        System.out.println();
    }

    public void reverse() {
        //Node current = head;
        Node prev = null;

        while( head != null){
            Node temp = head.next; // saving the rest of the link
            head.next = prev; //  deleting the existing link and establishing new link
            prev= head;
            head = temp;
        }
        head = prev; // head is moved to the last element. if we do not write this step, then head will be null--
        //--and that means there is no linked list and it will not print the reverse.

    }
}
