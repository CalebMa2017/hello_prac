package java07;

import org.junit.Test;

public class Example05 {
    public static void main(String[] args) {
        try {
            System.exit(0);
            int i = 10 / 0;
        }catch(Exception e) {
            e.printStackTrace();
        }finally {
            System.out.println("最终执行方法");
        }
    }
}
