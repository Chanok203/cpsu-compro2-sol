import java.util.Scanner;

public class Underline1 {
    
    static void printLine() {
        int K = 20;
        for (int j = 0; j < K; j++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String msg = sc.next();
            System.out.println(msg);
            Underline1.printLine();
        }
    }
}
