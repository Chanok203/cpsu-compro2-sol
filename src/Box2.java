import java.util.Scanner;

public class Box2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] caps = new int[N];
        int[] curs = new int[N];
        for (int i = 0; i < N; ++i) {
            caps[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            int action = sc.nextInt();

            if (action == 1) {
                int Q = sc.nextInt();
                int B = sc.nextInt() - 1;
                if (curs[B] + Q <= caps[B]) {
                    curs[B] += Q;
                    System.out.println(curs[B]);
                } else {
                    System.out.println(-1);
                }
            } else if (action == 2) {
                int Q = sc.nextInt();
                for (int i = 0; i < N; ++i) {
                    if (Q <= curs[i]) {
                        curs[i] -= Q;
                        Q = 0;
                        System.out.println((i+1) + " " + curs[i]);
                        break;
                    } else {
                        Q -= curs[i];
                        curs[i] = 0;
                    }
                }
                if (Q > 0) {
                    System.out.println(N + " 0");
                }
            }
        }
    }
}
