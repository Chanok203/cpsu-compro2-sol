import java.util.Scanner;

public class Partition2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        int center = arr[N / 2];
        int[] arr1 = new int[N];
        int c = 0;
        for (int i = 0; i < N; ++i) {
            if (arr[i] <= center) {
                arr1[c++] = arr[i];
            }
        }

        center = arr1[c / 2];
        for (int i = 0; i < c; ++i) {
            if (arr1[i] <= center) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < c; ++i) {
            if (arr1[i] > center) {
                System.out.print(arr1[i] + " ");
            }
        }
        System.out.println();
    }
}
