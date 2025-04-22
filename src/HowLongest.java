import java.util.Scanner;

public class HowLongest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int max = 0;
        int countMax = 0;
        int[] idxMax = new int[N];
        for (int i = 0; i < N; ++i) {
            if (arr[i] == 1) {
                count++;
                if (count > max) {
                    max = count;
                    countMax = 1;
                    idxMax[countMax - 1] = i - (count - 1);
                } else if (count == max) {
                    countMax++;
                    idxMax[countMax - 1] = i - (count - 1);
                }
            } else {
                count = 0;
            }
        }
        System.out.println(max);
        for (int i = 0; i < countMax; ++i) {
            System.out.print((idxMax[i] + 1) + " ");
        }
        System.out.println();
    }
}
