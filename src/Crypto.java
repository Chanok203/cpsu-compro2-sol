import java.util.Scanner;

public class Crypto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int idx = sc.nextInt();
        int key = sc.nextInt();

        // 3.1
        boolean valid1 = (arr[idx] + key <= 51743)
                || (arr[idx + 1] - key > 7832);

        // 3.2
        boolean valid2 = (arr[idx + 2] - key < 2394)
                || (arr[idx + 3] + key > 9213);

        // 3.1 + 3.2
        boolean valid3 = valid1 && valid2;

        System.out.println((valid1) ? "pass": "fail");
        System.out.println((valid2) ? "pass": "fail");
        System.out.println((valid3) ? "pass": "fail");
    }
}
