package java05;

/**
 * 链表的应用
 */
public class Example11 {
    public static void main(String[] args) {
        NodeManager nm = new NodeManager();
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.add(6);
        nm.print();
        nm.delete(6);
        nm.print();
    }
}

class NodeManager {
    //根节点
    private Node root;

    public boolean insert(int data, int index) {
        if(index == 0) {
            Node newNode = new Node(data);
            newNode.next = root;
            root = newNode;
            return true;
        }
        if(index < 0) return false;
        return root.insertNode(data, index, 0);
    }
    /**
     * 链表更新操作
     * @param data
     * @param reData
     * @return
     */
    public boolean update(int data, int reData) {
        if (root == null) {
            return false;
        }
        return root.updateNode(data, reData);
    }

    /**
     * 链表查询操作：root结点的索引为0
     * 查询不到返回-1
     * @param index
     * @return
     */
    public int get(int index) {
        if(root == null) return -1;
        return root.getNode(index, 0);
    }
    /**
     * 链表添加操作
     * @param data
     */
    public void add(int data) {
        if (root == null) {
            root = new Node(data);
        } else {
            root.addNode(data);
        }
    }

    /**
     * 链表删除操作
     * @param data
     * @return
     */
    public boolean delete(int data) {
        if (root == null) return false;
        boolean status = root.deleteNode(data);
        if (root.data == data) {
            root = root.next;
            status = true;
        }
        return status;
    }

    //    public boolean insert(int data, int index) {
//        if(index < 0) return false;
//        if(index == 0) {
//            Node newNode = new Node(data);
//            newNode.next = root;
//            root = newNode;
//        }
//
//    }
    class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

        /**
         * 递归添加结点
         * @param data
         */
        public void addNode(int data) {
            if (this.next == null) {
                this.next = new Node(data);
            } else {
                this.next.addNode(data);
            }
        }

        /**
         * 递归输出结点
         */
        public void printNode() {
            if (this != null) {
                System.out.print(this.data);
                if (this.next != null) {
                    System.out.print(" --> ");
                    this.next.printNode();
                } else {
                    System.out.println();
                }
            }
        }

        /**
         * 递归删除结点
         * @param data
         * @return
         */
        public boolean deleteNode(int data) {
            boolean status = false;
            if (this.next != null) {
                if (this.next.data == data) {
                    this.next = this.next.next;
                    status = true;
                    deleteNode(data);
                } else {
                    this.next.deleteNode(data);
                }
            }
            return status;
        }

        /**
         * 递归更新结点
         * @param data
         * @param reData
         * @return
         */
        public boolean updateNode(int data, int reData) {
            boolean status = false;
            if(this.data == data) {
                this.data = reData;
                status = true;
            }
            if(this.next != null) {
                this.next.updateNode(data, reData);
            }
            return status;
        }

        public int getNode(int index, int currentIndex) {
            if(currentIndex == index) return this.data;
            if(this.next == null) return -1;
            return this.next.getNode(index, currentIndex + 1);
        }

        public boolean insertNode(int data, int index, int currentIndex) {
            if(index == currentIndex + 1) {
                Node newNode = new Node(data);
                newNode.next = this.next;
                this.next = newNode;
                return true;
            }
            if(this.next == null) return false;
            return this.next.insertNode(data, index, currentIndex + 1);
        }
    }

    /**
     * 打印所有节点
     */
    public void print() {
        if (root == null) System.out.println("none");
        else {
            root.printNode();
        }
    }
}
