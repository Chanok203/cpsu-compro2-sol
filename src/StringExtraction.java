import java.util.Scanner;

public class StringExtraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.nextLine();
        int[] stats1 = new int[26 + 10];
        for (int i = 0; i < A.length(); ++i) {
            char c = A.charAt(i);
            // digit
            if ('0' <= c && c <= '9') {
                stats1[c - '0' + 26]++;
            }
            // a-z
            else if ('a' <= c && c <= 'z') {
                stats1[c - 'a']++;
            }
            // A-Z
            else if ('A' <= c && c <= 'Z') {
                stats1[c - 'A']++;
            }
        }

        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; ++i) {
            String B = sc.nextLine();
            int[] stats2 = new int[26 + 10];
            for (int j = 0; j < B.length(); ++j) {
                char c = B.charAt(j);
                // digit
                if ('0' <= c && c <= '9') {
                    stats2[c - '0' + 26]++;
                }
                // a-z
                else if ('a' <= c && c <= 'z') {
                    stats2[c - 'a']++;
                }
                // A-Z
                else if ('A' <= c && c <= 'Z') {
                    stats2[c - 'A']++;
                }
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
