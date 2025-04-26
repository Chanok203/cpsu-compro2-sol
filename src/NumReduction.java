import java.util.Scanner;

public class NumReduction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int Q = sc.nextInt();
        for (int q = 0; q < Q; ++q) {
            int pos = sc.nextInt() - 1;
            int k = sc.nextInt();

            int start = (pos - 2 >= 0) ? pos - 2 : 0;
            int stop = (pos + 2 < arr.length - 1) ? pos + 2 : arr.length - 1;

            for (int i = start; i <= stop; i++) {
                if (arr[i] > 0) {
                    arr[i] -= k;
                    if (arr[i] < 0) {
                        arr[i] = 0;
                    }
                }
            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
