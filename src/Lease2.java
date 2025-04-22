import java.util.Scanner;

public class Lease2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; ++i) {
            arr[i] = sc.nextInt();
        }
        int yearStart = sc.nextInt();

        int Y = sc.nextInt();
        for (int i = 0; i < Y; ++i) {
            int X = sc.nextInt();
            boolean full = true;
            for (int j = 0; j < arr.length; ++j) {
                int year = arr[j] + yearStart - 1;
                if (year < X) {
                    System.out.print((j+1)+" ");
                    full = false;
                }
            }
            if (full) {
                System.out.print("full");
            }
            System.out.println();
        }
    }
}
