package java05.example02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CosmeticManager {
    protected Cosmetic[] cosmetics = new Cosmetic[5];
    protected int count;

    public int getCount() {
        return count;
    }

    protected void add(Cosmetic cosmetic) {
        if (count == cosmetics.length) copyOf();
        cosmetics[count++] = cosmetic;
    }

    protected boolean insert(Cosmetic cosmetic, int index) {
        if (index > count + 1 || index < 0) return false;
        if (count == cosmetics.length) copyOf();
        for (int i = count; i >= index; i--) {
            cosmetics[i + 1] = cosmetics[i];
        }
        cosmetics[index] = cosmetic;
        count++;
        return true;
    }

    protected boolean delete(Cosmetic cosmetic) {
        boolean result = false;
        for (int i = 0; i < count; i++) {
            Cosmetic current = cosmetics[i];
            if (current.getName().equals(cosmetic.getName()) && Objects.equals(current.getPrice(), cosmetic.getPrice())
                    && current.getType().equals(cosmetic.getType())) {
                for (int j = i; j < count - 1; j++) {
                    cosmetics[j]=cosmetics[j+1];
                }
                result = true;
                count--;
            }
        }
        return result;
    }

    protected boolean updateByNameAndType(Cosmetic cosmetic) {
        boolean result = false;
        for(int i = 0; i< count; i++) {
            Cosmetic current = cosmetics[i];
            if(current.getName().equals(cosmetic.getName()) && current.getType().equals(cosmetic.getType())) {
                cosmetics[i].setPrice(cosmetic.getPrice());
                return true;
            }
        }
        return false;
    }

    protected List<Cosmetic> getCosmeticByPrice(double low, double high) {
        List<Cosmetic> result = new ArrayList<>();
        for(int i = 0 ; i < count ; i++) {
            if(cosmetics[i].getPrice() >= low && cosmetics[i].getPrice() <= high) {
                result.add(new Cosmetic(cosmetics[i].getName(), cosmetics[i].getType(), cosmetics[i].getPrice()));
            }
        }
        if(result.size() == 0) return null;
        return result;
    }

    protected void printAll() {
        System.out.println("----------------------------------------------");
        if(count == 0) {
            System.out.println("没有商品");
            return;
        }
        for(int i = 0 ; i< count ; i++) {
            System.out.println(cosmetics[i]);
        }

    }
    protected void copyOf() {
        cosmetics = Arrays.copyOf(cosmetics, cosmetics.length + cosmetics.length / 2 + 1);
    }
}
