import java.util.Scanner;

public class Cumulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];

        for (int k = 0; k < K; ++k) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();
            for (int i = X; i <= Y; ++i) {
                arr[i] += Z;
            }
            for (int i = 0; i < arr.length-1; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
