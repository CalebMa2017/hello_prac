package java03.example02;

public class PrintCharTriangle {
    public static void main(String[] args) {
        int n = 40;
        char c = 'A';
        for(int i = 0; i< n ; i++) {
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i+1; j++) {
                System.out.print(c);
            }
            c ++;
            System.out.println();
        }
    }

}
