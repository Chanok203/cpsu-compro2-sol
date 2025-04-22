import java.util.Scanner;

public class OutBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();

        boolean wasPrint = false;
        for (int i = 0; i < N; ++i) {
            if (!(x1 <= arr[i] && arr[i] <= x2)) {
                System.out.print(arr[i] + " ");
                wasPrint = true;
            }
        }
        if (!wasPrint) {
            System.out.println("no data");
        } else {
            System.out.println();
        }
    }
}
