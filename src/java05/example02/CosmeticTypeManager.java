package java05.example02;

public class CosmeticTypeManager extends CosmeticManager {
    public void printByType(String type) {
        System.out.println("-----------------------------------");
        if(count == 0) {
            System.out.println("没有商品");
            return;
        }
        for(int i = 0; i < count ; i++) {
            if (cosmetics[i].getType().equals(type)) {
                System.out.println(cosmetics[i]);
            }
        }
    }
}
