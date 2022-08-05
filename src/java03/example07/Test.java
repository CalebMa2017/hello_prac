package java03.example07;

public class Test {
    @org.junit.Test
    public void testFn() {
        for(int i = 0 ; i< 10; i++) {
            System.out.println(i);
            if(i == 5) continue;
        }
    }
}
