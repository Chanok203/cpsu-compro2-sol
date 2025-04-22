import java.util.Scanner;

public class ArrayJump2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int idx = sc.nextInt() - 1;
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        

        while (true) {
            if (N <= idx) {
                System.out.println("out of bounds");
                break;
            }

            System.out.println((idx + 1) + " " + arr[idx]);
            idx += arr[idx];
        }
    }  
}
