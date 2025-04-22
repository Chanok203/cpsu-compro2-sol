import java.util.Scanner;

public class OddEvenZero1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        int c1 = 0;
        int c2 = 0;
        for (int i = 0; i < N; ++i) {
            int a = sc.nextInt();
            if (a == 0) {
                arr1[c1++] = a;
                arr2[c2++] = a;
            } else if (a % 2 == 0) {
                arr2[c2++] = a;
            } else {
                arr1[c1++] = a;
            }
        }
        for (int i = 0; i < c1; ++i) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < c2; ++i) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}
