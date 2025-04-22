import java.util.Scanner;

public class ArrayJump1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }

        int count = 0;
        int idx = 0;
        while (true) {
            if (count == 5) {
                break;
            }

            if (N <= idx) {
                System.out.println("out of bounds");
                break;
            }

            System.out.println((idx + 1) + " " + arr[idx]);
            idx += arr[idx];
            count++;
        }
    }
}
