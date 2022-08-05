package java05;

/**
 * 简单工厂模式的复习
 */
public class Example08 {
    public static void main(String[] args) {
        Product computer = ProductFactory.getProduct("computer");
        computer.work();
        Product phone = ProductFactory.getProduct("phone");
        phone.work();
        Product none = ProductFactory.getProduct("none");
        if(none!=null) {
            none.work();
        }else {
            System.out.println(none);
        }
    }
}
class ProductFactory {
    public static Product getProduct(String name) {
        if("computer".equals(name)) {
            return new Computer();
        }else if("phone".equals(name)) {
            return new Phone();
        }
        return null;
    }
}
interface Product {
    void work();
}
class Computer implements Product {
    @Override
    public void work() {
        System.out.println("电脑正在工作...");
    }
}
class Phone implements Product {
    @Override
    public void work() {
        System.out.println("手机正在工作...");
    }
}
