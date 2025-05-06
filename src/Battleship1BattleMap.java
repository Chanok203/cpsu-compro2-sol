import java.util.Scanner;

public class Battleship1BattleMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int[][] map = new int[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                map[r][c] = sc.nextInt();
            }
        }
        int K = sc.nextInt();

        System.out.println(K);
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                System.out.print(map[r][c] + " ");
            }
            System.out.println();
        }
    }
}