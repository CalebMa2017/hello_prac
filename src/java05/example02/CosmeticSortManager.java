package java05.example02;

import java.util.Arrays;

public class CosmeticSortManager extends CosmeticManager{
    @Override
    protected void printAll() {
        System.out.println("-----------------------------");

        if(count == 0) {
            System.out.println("没有商品");
            return;
        }
        Cosmetic[] sortArray = Arrays.copyOf(cosmetics, cosmetics.length);
        for(int i = 0; i < count-1; i++) {
            for(int j = 0; j < count - i - 1; j++) {
                if(sortArray[j].getPrice() > sortArray[j+1].getPrice()) {
                    Cosmetic temp = sortArray[j];
                    sortArray[j] = sortArray[j+1];
                    sortArray[j+1] = temp;
                }
            }
        }

        for(int i = 0 ; i < count; i++) {
            System.out.println(sortArray[i]);
        }
    }
}
