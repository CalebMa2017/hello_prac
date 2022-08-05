package java02.example06;

public class PrintGraph3 {
    public static void main(String[] args) {
        int n = 100;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j <2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
