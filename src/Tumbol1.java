import java.util.Scanner;

class Tumbol_1 {
    String name;
    int latitude;
    int longitude;
    int population;
    int availBudget;

    public Tumbol_1(String name, int latitude, int longitude, int population) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.population = population;
        this.availBudget = this.population * 5_000;
    }

    void allocateBudget(int[] budgets) {
        boolean printed = false;
        for (int i = 0; i < budgets.length; i++) {
            if (this.availBudget - budgets[i] >= 0) {
                System.out.print((i + 1) + " ");
                this.availBudget -= budgets[i];
                printed = true;
            }
        }
        if (!printed) {
            System.out.print("none");
        }
        System.out.println();
    }

}

public class Tumbol1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int latitude = sc.nextInt();
        int longitude = sc.nextInt();
        int population = sc.nextInt();
        int N = sc.nextInt();
        int[] budgets = new int[N];
        for (int i = 0; i < budgets.length; i++) {
            budgets[i] = sc.nextInt();
        }
        
        Tumbol_1 tumbol = new Tumbol_1(name, latitude, longitude, population);
        tumbol.allocateBudget(budgets);
    }
}
