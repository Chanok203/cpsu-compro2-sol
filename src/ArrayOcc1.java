import java.util.Scanner;

public class ArrayOcc1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N + 1];
        int countOut = 0;
        int countNot = 0;
        int max = 0;
        for (int i = 0; i < K; ++i) {
            int x = sc.nextInt();
            if (x < 1 || N < x) {
                countOut++;
                continue;
            }
            if (arr[x] > 0) {
                countNot++;
            }
            arr[x]++;
            if (arr[x] > max) {
                max = arr[x];
            }
        }
        System.out.println(K - (countOut + countNot));
        System.out.println(countOut);
        System.out.println(countNot);
        for (int i = 1; i <= N; ++i) {
            if (arr[i] == max) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
