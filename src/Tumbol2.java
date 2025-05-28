import java.util.Scanner;

class Tumbol_2 {
    String name;
    int latitude;
    int longitude;
    int population;
    int availBudget;

    public Tumbol_2(String name, int latitude, int longitude, int population) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.availBudget = this.population * 5_000;
    }

    int allocateBudget(int[] budgets) {
        int sum = 0;
        boolean printed = false;
        for (int i = 0; i < budgets.length; i++) {
            if (this.availBudget - budgets[i] >= 0) {
                System.out.print((i + 1) + " ");
                this.availBudget -= budgets[i];
                printed = true;
                sum += budgets[i];
            }
        }
        if (!printed) {
            System.out.print("none");
        }
        System.out.println();
        return sum;
    }

}

public class Tumbol2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        Tumbol_2[] tumbols = new Tumbol_2[K];
        for (int k = 0; k < K; k++) {
            String name = sc.next();
            int latitude = sc.nextInt();
            int longitude = sc.nextInt();
            int population = sc.nextInt();
            tumbols[k] = new Tumbol_2(name, latitude, longitude, population);
        }
        int[][] budgets = new int[K][];
        for (int k = 0; k < K; k++) {
            int N = sc.nextInt();
            budgets[k] = new int[N];
            for (int i = 0; i < budgets[k].length; i++) {
                budgets[k][i] = sc.nextInt();
            }
        }
        int sum = 0;
        for (int k = 0; k < K; k++) {
            sum += tumbols[k].allocateBudget(budgets[k]);
        }
        System.out.println(sum);
    }
}
