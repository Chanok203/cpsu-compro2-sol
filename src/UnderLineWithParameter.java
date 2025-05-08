import java.util.Scanner;

public class UnderLineWithParameter {
    static void printLine(int K) {
        for (int j = 0; j < K; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String msg = sc.next();
            int K = sc.nextInt();
            System.out.println(msg);
            UnderLineWithParameter.printLine(K);
        }
    }
}
