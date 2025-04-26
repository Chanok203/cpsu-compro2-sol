import java.util.Scanner;

public class SimplePoker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int n = 0; n < N; ++n) {
            int[] cards = new int[10];
            int[] input = new int[5];
            for (int i = 0; i < 5; ++i) {
                input[i] = sc.nextInt();
                cards[input[i]]++;
            }
            int maxCard = input[0];
            int max = cards[input[0]];

            int maxCard2 = -1;
            for (int i = 1; i < input.length; ++i) {
                if (cards[input[i]] > max) {
                    max = cards[input[i]];
                    maxCard = input[i];
                    maxCard2 = -1;
                }
                else if (cards[input[i]] == max && maxCard != input[i]) {
                    maxCard2 = input[i];
                }
            }

            if (max == 1) {
                System.out.println("No Combination");
            } else if (max == 2) {
                if (maxCard2 == -1) {
                    System.out.println("One Pair of " + maxCard);
                } else {
                    System.out.println("Two Pair of " + maxCard + " and " + maxCard2);
                } 
            } else if (max == 3) {
                System.out.println("Triple of " + maxCard);
            } else if (max == 4) {
                System.out.println("Four of a Kind of " + maxCard);
            }
        }
    }
}
