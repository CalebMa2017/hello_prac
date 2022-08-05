package java02.example05;

/**
 * 输出10个斐波那契（Fibonacci）数列：1 1 2 3 5 8 13 21 34 55。
 * （特点：第1,2两个数值为1，从第三个数开始，该数是其前面两个数之和）
 */
public class PrintFibonacci {
    public static void main(String[] args) {
        int n = 10;
        int arr[] = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 2] + arr[i - 1];
        }
        int j = 0;
        do {
            System.out.print(arr[j++] + " ");
        }while(j < n);
    }
}
