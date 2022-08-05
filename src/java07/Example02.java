package java07;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 中  2. 英");
        int type = sc.nextInt();
        ResourceBundle rb = null;
        switch (type) {
            case 1:
                Locale lz= new Locale("zh", "CN");
                rb = ResourceBundle.getBundle("java07.info_zh_CN", lz);
                break;
            case 2:
                Locale le = new Locale("en", "US");
                rb = ResourceBundle.getBundle("java07.info", le);
                break;
            default:
                Locale l = Locale.getDefault();
                rb = ResourceBundle.getBundle("java07.info", l);
        }
        System.out.println(rb.getString("sys.welcome"));
        while(true) {
            System.out.println(rb.getString("sys.input"));
            String opr = sc.next();
            if("exit".equals(opr)) {
                System.out.println(rb.getString("sys.exit"));
                break;
            }
        }

    }
}
