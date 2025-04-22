import java.util.Scanner;

public class TargetLand {
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
                System.out.println("no");
                continue;
            }

            if (stop < 0 || N <= stop) {
                System.out.println("no");
                continue;
            }

            int sum = 0;
            for (int i = start; i <= stop; ++i) {
                sum += prices[i];
            }
            System.out.println(sum);
        }
    }
}
