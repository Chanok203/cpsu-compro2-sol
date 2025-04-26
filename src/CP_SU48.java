import java.util.Scanner;

public class CP_SU48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K1 = sc.nextInt();
        int K2 = sc.nextInt();

        int[] arr1 = new int[N];
        int[] arr2 = new int[N];

        int P = sc.nextInt();
        for (int p = 0; p < P; ++p) {
            int R = sc.nextInt() - 1;
            int S = sc.nextInt();

            if (S == 1) {
                if (arr1[R] < K1) {
                    arr1[R]++;
                    System.out.println(1);
                } else if (arr2[R] < K2) {
                    arr2[R]++;
                    System.out.println(2);
                } else {
                    System.out.println(0);
                }
            } else if (S == 2) {
                if (arr2[R] < K2) {
                    arr2[R]++;
                    System.out.println(2);
                } else if (arr1[R] < K1) {
                    arr1[R]++;
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
