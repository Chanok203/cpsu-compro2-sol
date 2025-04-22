import java.util.Scanner;

public class Labor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        int[] labors = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = sc.nextInt();
        }
        for (int i = 0; i < N; ++i) {
            labors[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int q = 0; q < Q; ++q) {
            int K = sc.nextInt();
            int M = sc.nextInt() - 1;

            int start = M - (K / 2);
            int stop = M + (K / 2);

            boolean printNo = false;
            if (start < 0 || N <= start) {
                printNo = true;
                start = (start < 0) ? 0 : N;
            }

            if (stop < 0 || N <= stop) {
                printNo = true;
                stop = (stop < 0) ? -1 : N - 1;
            }

            if (printNo) {
                System.out.print("no ");
            }

            int sumPrice = 0;
            boolean printLabor = true;
            for (int i = start; i <= stop; ++i) {
                sumPrice += prices[i];
                printLabor &= (labors[i] >= 5);
            }
            System.out.print(sumPrice);

            if (printLabor && !printNo) {
                System.out.print(" labor");
            }

            System.out.println();
        }
    }
}
