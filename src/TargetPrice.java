import java.util.Scanner;

public class TargetPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int q = 0; q < Q; ++q) {
            int K = sc.nextInt();
            int M = sc.nextInt() - 1;

            int start = M - (K / 2);
            int stop = M + (K / 2);

            if (start < 0 || N <= start) {
                System.out.print("no ");
                start = (start < 0) ? 0 : N;
            }

            if (stop < 0 || N <= stop) {
                System.out.print("no ");
                stop = (stop < 0) ? -1 : N-1;
            }

            int sum = 0;
            for (int i = start; i <= stop; ++i) {
                sum += prices[i];
            }
            System.out.println(sum);
        }
    }
}
