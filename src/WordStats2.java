import java.util.Scanner;

public class WordStats2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mins = new int[26];
        int[] maxs = new int[26];

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; ++i) {
            String msg = sc.nextLine();
            char c = msg.charAt(0);
            int idx = c - 'A';

            int L = msg.length();
            if (maxs[idx] < L) {
                maxs[idx] = L;
            }

            if (mins[idx] == 0 || L < mins[idx]) {
                mins[idx] = L;
            }
        }
        for (int i = 0; i < mins.length; ++i) {
            if (mins[i] > 0) {
                char c = (char) (i + 'A');
                System.out.println(c + " " + mins[i] + " " + maxs[i]);
            }
        }
    }
}
