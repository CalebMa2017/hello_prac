package java05.example12;

public class LinkedList {
    private Node root;

    public void add(int data) {
        if(root == null) root = new Node(data);
        else {
            Node p = root;
            while(p.next!=null) {
                p = p.next;
            }
            p.next = new Node(data);
        }
    }

    public boolean delete(int data) {
        if(root == null) return false;
        boolean status = false;
        Node p = root;
        while(p!= null && p.data == data) {
            root = root.next;
            p = root;
            status = true;
        }
        while(p!=null && p.next!=null) {
            if(p.next.data == data) {
                p.next = p.next.next;
                status = true;
            }else {
                p = p.next;
            }
        }
        return status;
    }

    public boolean update(int data, int reData) {
        if(root == null ) return false;
        boolean status = false;
        Node p = root;
        while(p!=null) {
            if(p.data == data) {
                p.data = reData;
                status = true;
            }
            p = p.next;
        }
        return status;
    }

    public int getByIndex(int index) {
        if(root == null || index < 0) return -1;
        Node p = root;
        for(int i = 0; i < index; i++) {
            if(p.next!=null) p = p.next;
            else return -1;
        }
        return p.data;
    }
    public boolean insert(int data, int index) {
        if(root == null || index < 0) return false;
        if(index == 0) {
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
            return true;
        }
        Node p = root;
        for(int i = 0; i < index - 1; i++) {
            if(p != null) {
                p = p.next;
            }else {
                return false;
            }
        }
        Node newNode = new Node(data);
        newNode.next = p.next;
        p.next =newNode;
        return true;
    }
    public void print() {
        if(root == null) System.out.println("none");
        else {
            Node p = root;
            while(p!=null) {
                System.out.print(p.data);
                if(p.next!=null) System.out.print(" --> ");
                else System.out.println();
                p = p.next;
            }
        }
    }

}
