import java.util.Scanner;

public class ArrayOcc2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N + 1];
        int countOut = 0;
        int countNot = 0;
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
        }

        int count = 0;
        int max = 0;
        for (int i = 1; i <= N; ++i) {
            if (arr[i] == 0) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }
        }
        if (count > max) {
            max = count;
        }
        System.out.println(max);

        count = 0;
        for (int i = 1; i <= N; ++i) {
            if (arr[i] == 0) {
                count++;
            } else {
                if (count == max) {
                    System.out.print((i-1) + " ");
                }
                count = 0;
            }
        }
        if (count == max) {
            System.out.print(N + " ");
        }
    }

}
