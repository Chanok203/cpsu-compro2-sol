import java.util.Scanner;

public class Reserve3Vans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int A = 0;
        int B = 0;
        int C = 0;

        for (int i = 0; i < N; ++i) {
            int t = sc.nextInt();
            if (A <= B && A <= C) {
                A += t;
                System.out.println("A");
            } else if (B <= A && B <= C) {
                B += t;
                System.out.println("B");
            } else {
                C += t;
                System.out.println("C");
            }
        }
    }
}
