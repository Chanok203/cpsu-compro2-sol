import java.util.Scanner;

public class Auction2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] prices = new int[N];
        int[] counts = new int[N];
        for (int i = 0; i < N; ++i) {
            prices[i] = sc.nextInt();
        }
        int K = sc.nextInt();
        for (int k = 0; k < K; ++k) {
            for (int i = 0; i < N; ++i) {
                int newPrice = sc.nextInt();
                if (newPrice <= prices[i] || counts[i] >= 3) {
                    counts[i]++;
                    continue;
                }
                prices[i] = newPrice;
                counts[i] = 0;
            }
            for (int i = 0; i < N; ++i) {
                System.out.print(prices[i] + " ");
            }
            System.out.println();
        }
    }
}
