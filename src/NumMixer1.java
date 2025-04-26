import java.util.Scanner;

public class NumMixer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        int number = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = A[i];
            int b = B[N - 1 - i];
            if (number > 0) {
                System.out.print(a + " " + b + " ");
            } else {
                System.out.print(b + " " + a + " ");
            }
        }
        System.out.println();
    }
}
