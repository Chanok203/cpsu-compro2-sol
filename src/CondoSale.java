import java.util.Scanner;

public class CondoSale {
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
        System.out.println(count);
        for (int i = 0; i < N; ++i) {
            if (rooms[i] > 0) {
                System.out.println(i+P);
            }
        }
    }
}
