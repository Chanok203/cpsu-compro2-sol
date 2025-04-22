import java.util.Scanner;

public class ArrayCompress2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        int k1 = sc.nextInt();
        int k2 = sc.nextInt();
        int k3 = sc.nextInt();

        int sum = 0;
        int count = 0;
        for (int i = 0; i < N; ++i) {
            if (arr[i] == k1 || arr[i] == k2 || arr[i] == k3) {
                if (i == 0) {
                    System.out.print(arr[i] + " ");
                } else if (count > 0) {
                    System.out.print(sum + " " + arr[i] + " ");
                    sum = 0;
                    count = 0;
                }
            } else {
                sum += arr[i];
                count++;
                if (i == N - 1) {
                    System.out.print(sum);
                }
            }
        }
    }
}