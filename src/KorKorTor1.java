import java.util.Scanner;

class Party1 {

    String name;
    int nMembers;
    String[] firstnames;
    String[] lastnames;
    int[] regions;

    Party1(String name, int nMembers, Scanner sc) {
        this.name = name;
        this.nMembers = nMembers;
        firstnames = new String[nMembers];
        lastnames = new String[nMembers];
        regions = new int[nMembers];
        for (int i = 0; i < nMembers; i++) {
            firstnames[i] = sc.next();
            lastnames[i] = sc.next();
            regions[i] = sc.nextInt();
        }
    }

    void printInfo(int region) {
        if (region < 0) {
            System.out.println("invalid region number");
            return;
        }
        boolean printed = false;
        for (int i = 0; i < this.nMembers; i++) {
            if (region == 0) {
                String line = String.format("%s %s %d",
                        this.firstnames[i],
                        this.lastnames[i],
                        this.regions[i]);
                System.out.println(line);
                printed = true;
            } else if (this.regions[i] == region) {
                String line = String.format("%s %s",
                        this.firstnames[i],
                        this.lastnames[i]);
                System.out.println(line);
                printed = true;
            }
        }
        if (!printed) {
            System.out.println("none");
        }
    }

}

public class KorKorTor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String[] names = new String[N + 1];
        int[] nMembers = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            names[i] = sc.next();
            nMembers[i] = sc.nextInt();
        }

        Party1[] parties = new Party1[N + 1];
        for (int i = 1; i <= N; i++) {
            parties[i] = new Party1(names[i], nMembers[i], sc);
        }
        Scanner scan = sc;
        Party1[] party = parties;

        // code from PDF *** do not edit ***
        final int K = sc.nextInt();
        for (int i = 0; i < K; ++i) {
            int partyNumber = scan.nextInt();
            int regionNumber = scan.nextInt();
            party[partyNumber].printInfo(regionNumber);
        }
    }
}
