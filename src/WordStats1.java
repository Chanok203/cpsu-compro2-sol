import java.util.Scanner;

public class WordStats1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dict = new int[26];
        // ใช้แค่ [65, 90] - 65 = [0, 25]
        int N = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < N; ++i) {
            char c = sc.nextLine().charAt(0);
            int idx = c - 'A';
            dict[idx]++;
        }

        for (int i = 0; i < dict.length; ++i) {
            if (dict[i] > 0) {
                char c = (char) (i + 'A');
                System.out.println(c + " " + dict[i]);
            }
        }
    }
}
