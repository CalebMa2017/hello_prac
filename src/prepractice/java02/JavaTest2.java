package prepractice.java02;


import org.testng.annotations.Test;

public class JavaTest2 {
    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("java.util.List");
            System.out.println(clazz);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testFn1() {
        String tokenHead = "Bearer";
        String str = "Bearer sdafawdsfrjew325235ldjsakf3998wejf2e8fj3e1t8431tj4529r9i20v";
        String substring = str.substring(tokenHead.length());
        System.out.println("---------------");
        System.out.println(substring);
        System.out.println("---------------");
    }
}
