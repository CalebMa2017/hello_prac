package java05.example02;

import java.util.List;

public class CosmeticTest {
    public static void main(String[] args) {
        CosmeticTypeManager cm = new CosmeticTypeManager();
        cm.printAll();
        Cosmetic c1 = new Cosmetic("雅诗兰黛", "001", 199.0);
        Cosmetic c2 = new Cosmetic("雅诗兰黛", "002", 299.0);
        Cosmetic c3 = new Cosmetic("雅诗兰黛", "003", 499.0);
        Cosmetic c4 = new Cosmetic("香奈儿" , "001" , 799.0);
        Cosmetic c5 = new Cosmetic("香奈儿" , "002" , 299.0);
        Cosmetic c6 = new Cosmetic("香奈儿" , "003" , 499.0);
        cm.add(c1);
        cm.add(c2);
        cm.add(c3);
        cm.add(c4);
        cm.add(c5);
        cm.add(c6);
        cm.printAll();
        System.out.println(cm.getCount());
        c6.setName("宝洁");
        cm.printAll();
        cm.insert(new Cosmetic("海蓝之谜", "001" , 399.0), 3);
        cm.printAll();
        System.out.println(cm.delete(new Cosmetic("雅诗兰黛", "003", 499.0)));
        cm.printAll();
        cm.updateByNameAndType(new Cosmetic("香奈儿", "002",888.0));
        cm.printAll();
        System.out.println("----------------------------------");
        List<Cosmetic> cosmeticByPrice = cm.getCosmeticByPrice(299.0, 599.0);
        cosmeticByPrice.forEach(System.out::println);

        cm.printByType("001");
    }
}
