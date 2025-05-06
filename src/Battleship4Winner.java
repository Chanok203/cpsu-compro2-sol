import java.util.Scanner;

public class Battleship4Winner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] ships = new int[R][C];
        int nShip = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                ships[r][c] = sc.nextInt();
                nShip += ships[r][c];
            }
        }
        int end = -1;
        int first = -1;

        int K = sc.nextInt();
        int out = 0;
        int[][] shots = new int[R][C];
        for (int k = 0; k < K; k++) {
            int r = sc.nextInt() - 1;
            int c = sc.nextInt() - 1;
            boolean isValidR = (0 <= r) && (r < R);
            boolean isValidC = (0 <= c) && (c < C);
            if (!isValidR || !isValidC) {
                out++;
            } else {
                shots[r][c]++;
                if (ships[r][c] == 1) {
                    nShip--;
                    end = k;
                    ships[r][c] = 2;

                    if (first == -1) {
                        first = k;
                    }
                }
            }
        }

        int firstHit = 0;
        int firstMiss = 0;
        int repeatHit = 0;
        int repeatMiss = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                // firstHit
                if (ships[r][c] > 0 && shots[r][c] > 0) {
                    firstHit++;
                }
                // firstMiss
                if (ships[r][c] == 0 && shots[r][c] > 0) {
                    firstMiss++;
                }
                // repeatHit
                if (ships[r][c] > 0 && shots[r][c] > 1) {
                    repeatHit += shots[r][c] - 1;
                }
                // repeatMiss
                if (ships[r][c] == 0 && shots[r][c] > 1) {
                    repeatMiss += shots[r][c] - 1;
                }
            }
        }
        System.out.println(firstHit);
        System.out.println(firstMiss);
        System.out.println(repeatHit);
        System.out.println(repeatMiss);
        System.out.println(out);

        if (nShip > 0) {
            System.out.println("battleship " + (first + 1));
        } else {
            System.out.println("attacker " + (end + 1));
        }
    }
}
