import java.util.Scanner;

public class TheVoiceSU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        int slot1 = K;
        int slot2 = K;

        for (int i = 1; i <= N; ++i) {
            int g = sc.nextInt();
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();

            if (s1 >= 9 && s2 < 9) {
                if (slot1 > 0) {
                    slot1--;
                    System.out.println(i + " 1");
                }
            }

            else if (s2 >= 9 && s1 < 9) {
                if (slot2 > 0) {
                    slot2--;
                    System.out.println(i + " 2");
                }
            }

            else if (s1 >= 9 && s2 >= 9) {
                if (g == 1) {
                    if (slot1 > 0) {
                        slot1--;
                        System.out.println(i + " 1");
                    } else if (slot2 > 0) {
                        slot2--;
                        System.out.println(i + " 2");
                    }
                } else {
                    if (slot2 > 0) {
                        slot2--;
                        System.out.println(i + " 2");
                    } else if (slot1 > 0) {
                        slot1--;
                        System.out.println(i + " 1");
                    }
                }
            }
        }
    }
}
