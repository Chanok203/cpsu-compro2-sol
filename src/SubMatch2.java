import java.util.Scanner;

public class SubMatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg1 = sc.nextLine();
        String msg2 = sc.nextLine();

        for (int i = 0; i < msg2.length() - 2; ++i) {
            String sub = msg2.substring(i, i+3);
            int idx = msg1.indexOf(sub);
            if (idx == -1) {
                System.out.println("No");
            } else {
                System.out.println(idx+1);
            }
        }
    }
}
