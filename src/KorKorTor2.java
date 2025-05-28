import java.util.Scanner;

class Precinct {
    String name;
    String[] partyNames;
    int[] scores;

    Precinct(String name, String[] partyNames) {
        this.name = name;
        this.partyNames = partyNames;
        this.scores = new int[partyNames.length];
    }

    void count(int partyId) {
        --partyId;
        if (partyId < 0 || this.partyNames.length <= partyId) {
            System.out.println("invalid number");
            return;
        }
        ++this.scores[partyId];
        String line = String.format("%s %d",
                this.partyNames[partyId],
                this.scores[partyId]);
        System.out.println(line);
    }

    void printInfo() {
        for (int i = 0; i < this.partyNames.length; i++) {
            String line = String.format("%d %s %d",
                    i + 1,
                    this.partyNames[i],
                    this.scores[i]);
            System.out.println(line);
        }
    }

    void printMax() {
        int max = -1;
        for (int i = 0; i < this.partyNames.length; i++) {
            if (this.scores[i] > max) {
                max = this.scores[i];
            }
        }
        for (int i = 0; i < this.partyNames.length; i++) {
            if (this.scores[i] == max) {
                String line = String.format("%d %s %d",
                        i + 1,
                        this.partyNames[i],
                        this.scores[i]);
                System.out.println(line);
            }
        }
    }
}

public class KorKorTor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int N = sc.nextInt();
        sc.nextLine();
        String[] partyNames = new String[N];
        for (int i = 0; i < N; i++) {
            partyNames[i] = sc.nextLine();
        }
        Precinct precinct = new Precinct(name, partyNames);
        int K = sc.nextInt();
        for (int k = 0; k < K; k++) {
            int action = sc.nextInt();
            if (action == 1) {
                int P = sc.nextInt();
                precinct.count(P);
            } else if (action == 2) {
                precinct.printInfo();
            } else if (action == 3) {
                precinct.printMax();
            }
        }
    }
}
