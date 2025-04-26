import java.util.Scanner;

public class RollDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] pts = new int[N];
        for (int i = 0; i < pts.length; i++) {
            pts[i] = sc.nextInt();
        }
        int[] moves = new int[N];
        for (int i = 0; i < moves.length; i++) {
            moves[i] = sc.nextInt();
        }
        int P = sc.nextInt();
        int cur = 0;
        int pt = 0;
        for (int p = 0; p < P; ++p) {
            int step = sc.nextInt();
            cur = (cur + step + N) % N;
            pt += pts[cur];
            if (moves[cur] != 0) {
                cur = (cur + moves[cur] + N) % N;
                pt += pts[cur];
            }
            System.out.println(cur + " " + pt);
        }
    }
}
