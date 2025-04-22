import java.util.Scanner;

public class HowLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        for (int k = 0; k < 3; ++k) {
            int start = sc.nextInt() - 1;
            int count = 0;
            for (int i = start; i < N; ++i) {
                if (arr[i] == 1) {
                    count++;
                } else {
                    break;
                }
            }
            System.out.println(count);
        }
    }
}
