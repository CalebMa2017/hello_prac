package java02.example06;

public class PrintGraph2 {
    public static void main(String[] args) {
        int n = 20;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(j < n-i-1) {
                    System.out.print(" ");
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
