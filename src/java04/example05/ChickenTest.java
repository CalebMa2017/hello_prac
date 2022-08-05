package java04.example05;

public class ChickenTest {
    public static void main(String[] args) {
        ChickenManager chickenManager = new ChickenManager();
        Chicken chicken1 = new Chicken("小黄", "yellow", 3, 1);
        Chicken chicken2 = new Chicken("小白", "white", 2, 2);
        Chicken chicken3 = new Chicken("小黄", "yellow", 1, 3);
        Chicken chicken4 = new Chicken("小黄", "yellow", 4, 4);
        Chicken chicken5 = new Chicken("小白", "white", 2, 5);
        chickenManager.add(chicken1);
        chickenManager.add(chicken2);
        chickenManager.add(chicken3);
        chickenManager.add(chicken4);
        chickenManager.add(chicken5);
        chickenManager.printAll();
        Chicken chicken6 = new Chicken("小蓝", "blue", 5, 6);
        chickenManager.add(chicken6);
        chickenManager.printAll();
        Chicken chicken7 = new Chicken("小黑", "black", 5, 7);
        chickenManager.insert(chicken7, 0);
        chickenManager.printAll();
        chickenManager.deleteById(3);
        chickenManager.deleteById(7);
        chickenManager.deleteById(6);
        chickenManager.deleteByColor("white");
        chickenManager.printAll();
        System.out.println(chickenManager.getCount());
        chickenManager.insert(chicken7, 2);
        chickenManager.printAll();
        Chicken chicken8 = new Chicken("小粉" , "pink" , 1, 8);
        chickenManager.updateById(chicken8, 1);
        chickenManager.printAll();
    }
}
