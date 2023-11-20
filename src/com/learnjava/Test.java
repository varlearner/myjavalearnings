package src.com.learnjava;

public class Test {
    public static void main(String[] args) {
        CustomLinkedList customList = new CustomLinkedList();

        customList.add(3);
        customList.add(7);
        customList.add(1);

        customList.addNewNode(4, 7);

        customList.display();

        customList.remove(7);
        customList.display();




        System.out.println("Before reversing linked list");
        customList.display();

        customList.reverse();

        System.out.println("After reversing");
        customList.display();


    }
}
