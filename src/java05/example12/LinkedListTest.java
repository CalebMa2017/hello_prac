package java05.example12;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(8);
        linkedList.print();
        linkedList.insert( 7, 5);
        linkedList.print();
//        System.out.println(linkedList.getByIndex(6));
//        System.out.println(linkedList.getByIndex(5));
//        System.out.println(linkedList.getByIndex(-1));
//        System.out.println(linkedList.getByIndex(0));
    }
}
