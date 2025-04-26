import java.util.Scanner;

public class Calculator_v3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] sums = new int[N];
        int count = 0;
        int sum = 0;

        while (true) {
            int action = sc.nextInt();
            if (action == 0) {
                break;
            }
            if (action == 1) {

                int a = sc.nextInt();
                int b = sc.nextInt();

                boolean validA = (0 <= a && a < arr.length);
                boolean validB = (0 <= b && b < arr.length);

                if (validA && validB) {
                    int c = arr[a] + arr[b];
                    System.out.println(c);

                    sums[count++] = c;
                    sum += c;
                } else {
                    System.out.println("error");
                }
            } else if (action == 2) {
                if (count - 1 >= 0) {
                    System.out.println(sums[--count]);
                } else {
                    System.out.println("none");
                }
            }
        }
        if (count == 0) {
            System.out.println("empty");
        } else {
            for (int i = 0; i < count; i++) {
                System.out.print(sums[i] + " ");
            }
            System.out.println();
        }
    }
}
