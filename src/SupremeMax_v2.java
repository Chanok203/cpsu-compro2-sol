import java.util.Scanner;

public class SupremeMax_v2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int stop = -1, start = -1;
        int count = 0;
        int innerMax = -1;
        int supMax = -1, supStart = -1, supStop = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                start = i - count;
                stop = i - 1;
                if (innerMax > supMax) {
                    supMax = innerMax;
                    supStart = start;
                    supStop = stop;
                }
                // System.out.printf("start: %d, stop: %d, innerMax: %d, supMax: %d, supStart:
                // %d, supStop: %d", start,
                // stop, innerMax, supMax, supStart, supStop);
                // System.out.println();
                if (innerMax > -1) {
                    System.out.print(innerMax + " ");
                }
                count = 0;
                innerMax = -1;
            } else {
                count++;
                // System.out.print(arr[i] + " ");
                if (arr[i] > innerMax) {
                    innerMax = arr[i];
                }
            }
        }
        System.out.println();
        System.out.println(supMax);
        for (int i = supStart; i <= supStop; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
