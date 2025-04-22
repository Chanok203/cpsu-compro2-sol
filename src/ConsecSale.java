import java.util.Scanner;

public class ConsecSale {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();
        int[] rooms = new int[N];
        int count = 0;
        for (int k = 0; k < K; ++k) {
            int id = sc.nextInt() - P;
            if (id < 0 || N <= id) {
                continue;
            }
            rooms[id]++;
            if (rooms[id] == 1) {
                count++;
            }
        }
        System.out.println(N - count);
        int max = 0;
        int c = 0;
        for (int i = 0; i < N; ++i) {
            if (rooms[i] > 0) {
                if (c > max) {
                    max = c;
                }
                c = 0;
            } else {
                c++;

            }
        }
        if (c > max) {
            max = c;
        }
        System.out.println(max);
    }
}
