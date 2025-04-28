import java.util.Scanner;

public class TrainCar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxC = 50;
        int maxP = 60;

        int C = sc.nextInt();
        int P = sc.nextInt();
        int K = sc.nextInt();

        int[] arrC = new int[C];
        int[] arrP = new int[P];

        for (int k = 0; k < K; ++k) {
            int T = sc.nextInt();
            int ID = sc.nextInt() - 1;
            int V = sc.nextInt();

            if (T == 1) {
                if (0 <= ID && ID < C && arrC[ID] + V <= maxC) {
                    arrC[ID] = arrC[ID] + V;
                }
            } else if (T == 2) {
                if (C <= ID && ID < C + P && arrP[ID - C] + V <= maxP) {
                    arrP[ID - C] = arrP[ID - C] + V;
                }
            }

            for (int i = 0; i < arrC.length; i++) {
                System.out.print(arrC[i] + " ");
            }
            for (int i = 0; i < arrP.length; i++) {
                System.out.print(arrP[i] + " ");
            }
            System.out.println();
        }
    }
}
