import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();

        int[] arr = new int[N];

        for (int k = 0; k < K; ++k) {
            int X = sc.nextInt() - 1;
            int Y = sc.nextInt() - 1;
            int Z = sc.nextInt();

            boolean valid = true;
            for (int i = X; i < Y; ++i) {
                if (P < arr[i] + Z) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = X; i < Y; ++i) {
                    arr[i] = arr[i] + Z;
                }
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}
