import java.util.Scanner;

public class CharSelector {
    String selectChar(String s, int[] k) {
        int L = s.length();
        if (L <= 1) {
            return s;
        }

        int step = k[L - 1];
        int target = (L - 1 - step);
        if (target < 0) {
            target = target + (step / L * L);
        }
        String cut = s.substring(0, L - 1);
        String next = selectChar(cut, k);
        return next + s.charAt(target);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        final int N = s.length();
        int[] k = new int[N];

        for (int i = 0; i < N; ++i) {
            k[i] = scan.nextInt();
        }

        CharSelector selector = new CharSelector();
        String ans = selector.selectChar(s, k);
        System.out.println(ans);
    }
}
