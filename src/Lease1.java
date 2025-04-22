import java.util.Scanner;

public class Lease1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        int yearStart = sc.nextInt();

        for (int i = 0; i < N; ++i) {
            int year = arr[i] + yearStart - 1;
            System.out.print(year + " ");
        }
    }
}
