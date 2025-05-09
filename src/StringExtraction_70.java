import java.util.Scanner;

public class StringExtraction_70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        A = A.toUpperCase();
        int[] stats1 = new int[200];
        for (int i = 0; i < A.length(); ++i) {
            char c = A.charAt(i);
            stats1[c]++;
        }

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; ++i) {
            String B = sc.nextLine();
            B = B.toUpperCase();
            int[] stats2 = new int[200];
            for (int j = 0; j < B.length(); ++j) {
                char c = B.charAt(j);
                stats2[c]++;
            }
            boolean isMe = true;
            for (int j = 0; j < stats1.length; ++j) {
                if (stats1[j] != stats2[j]) {
                    isMe = false;
                    break;
                }
            }
            System.out.println(isMe);
        }
        sc.close();
    }
}
