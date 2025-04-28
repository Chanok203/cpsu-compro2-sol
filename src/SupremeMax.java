import java.util.Scanner;

public class SupremeMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int max = 0;
        int supMax = 0;

        int startSupMax = -1;
        int stopSupMax = -1;
        int start = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                if (max > 0) {
                    System.out.print(max + " ");
                }
                if (max > supMax) {
                    supMax = max;
                    startSupMax = start;
                    stopSupMax = i - 1;
                }
                max = -1;
                start = i + 1;
            } else {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
        }
        System.out.println();
        System.out.println(supMax);
        for (int i = startSupMax; i <= stopSupMax; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
