import java.util.Scanner;

public class CutHalfRecursive {
    public static String cutHalf(String s) {
        int L = s.length();
        if (L <= 1) {
            return s;
        }

        int centerIdx = L / 2;
        char center = s.charAt(centerIdx);
        String left = s.substring(0, centerIdx);
        String right = s.substring(centerIdx+1);

        String resultLeft = cutHalf(left);
        String resultRight = cutHalf(right);
        return center + resultLeft + resultRight;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(cutHalf(str));
    }
}