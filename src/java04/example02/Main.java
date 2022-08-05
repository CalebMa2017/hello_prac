package java04.example02;


import java04.example02.bean.Legend;
import java04.example02.bean.Weapon;

public class Main {
    public static void main(String[] args) {
        Legend l1 = new Legend("张飞" , 23);
        System.out.println(l1);
        Weapon w1 = new Weapon("丈八蛇矛", "红色", l1);
        System.out.println(w1);
        l1.setWeapon(w1);
        System.out.println(l1);
    }

}
