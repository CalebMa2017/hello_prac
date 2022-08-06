package java07;

import java.util.Random;

public class Example04 {
    public static void main(String[] args) {
        Random random = new Random();
        for(int i = 0; i < 1000000; i++) {
            System.out.print(random.nextInt(2));
            if((i+1) % 1000 == 0) {
                System.out.println();
            }
        }
    }
}
