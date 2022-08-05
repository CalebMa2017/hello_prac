package java05.linked;

public class LinkTest {
    public static void main(String[] args) {
        LinkList2 ll2 = new LinkList2();
        ll2.add(2);
        ll2.add(1);
        ll2.add(7);
        ll2.add(9);
        ll2.add(0);
        ll2.add(4);
        ll2.add(3);
        ll2.print();
        ll2.insert(688, 88);
        ll2.print();
//        System.out.println(ll2.getByIndex(9));

    }
}
