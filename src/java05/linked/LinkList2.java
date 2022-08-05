package java05.linked;

public class LinkList2 {
    private Node root;
    private int currentIndex;

    public void update(int index, int data) {
        if(index < 0) return;
        currentIndex = 0;
        if(root!=null) {
            root.updateNode(index, data);
        }
    }

    public void insert(int index, int data) {
        if(index < 0) return;
        currentIndex = 0;
        if(index == currentIndex) {
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
            return;
        }else if(root!=null){
            root.insertNode(index, data);
        }
    }
    public void add(int data) {
        if(root == null) {
            root = new Node(data);
            return;
        }
        root.addNode(data);
    }

    public void delete(int data) {
        if(root!= null) {
            if(root.data == data) {
                root = root.next;
            } else {
                root.deleteNode(data);
            }
        }
    }

    public int getByIndex(int index) {
        if(index < 0) throw new IndexOutOfBoundsException("索引超出范围");
        currentIndex = 0;
        if(root!= null) {
            return root.getNodeByIndex(index);
        }else {
            throw new IndexOutOfBoundsException("索引超出范围");
        }
    }
    public void print() {
        if(root == null) System.out.println("none");
        else root.printNode();
    }
    class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
        }

        public void addNode(int data) {
            if(this.next == null) {
                this.next = new Node(data);
            }else {
                this.next.addNode(data);
            }
        }

        public void printNode() {
            System.out.print(this.data);
            if(this.next!=null) {
                System.out.print(" -> ");
                this.next.printNode();
            }else {
                System.out.println();
            }
        }

        public void deleteNode(int data) {
            if(this.next!=null) {
                if(this.next.data == data) {
                    this.next = this.next.next;
                }else {
                    this.next.deleteNode(data);
                }
            }
        }

        public void updateNode(int index, int data) {
            if(currentIndex++ == index) {
               this.data = data;
            }else if(this.next!=null) {
                this.next.updateNode(index, data);
            }
        }

        public int getNodeByIndex(int index) {
            if(currentIndex++ == index) {
                return this.data;
            }else if (this.next!= null){
                return this.next.getNodeByIndex(index);
            }else {
                throw new IndexOutOfBoundsException("索引超出范围");
            }
        }

        public void insertNode(int index, int data) {
            if (++currentIndex == index) {
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
                return;
            }else if(this.next!=null){
                this.next.insertNode(index, data);
            }
        }
    }
}
