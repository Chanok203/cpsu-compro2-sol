import java.util.Scanner;

public class Partition1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        int center = arr[N / 2];
        for (int i = 0; i < N; ++i) {
            if (arr[i] <= center) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < N; ++i) {
            if (arr[i] > center) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
