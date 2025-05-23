import java.util.Scanner;

public class SocialSecurity {
    static int max_salary33 = 15000;
    static int max_salary39 = 4800;

    public static int PensionCARE(int[] month, double[] salary, int month39) {
        int L = month.length;
        double sumSalary = 0;
        int sumMonth = 0;
        for (int i = 0; i < L; i++) {
            sumSalary += month[i] * Math.min(salary[i], max_salary33);
            sumMonth += month[i];
        }
        sumMonth += month39;
        sumSalary += (max_salary39 * month39);
        int avg = (int) (sumSalary / sumMonth);
        int care1 = (int) (avg * 0.2);
        if (sumMonth > 15 * 12) {
            double dif = sumMonth - (15 * 12);
            int care2 = (int) (0.015 * (dif / 12) * avg);
            care1 += care2;
        }
        return care1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] month = new int[n];
        double[] salary = new double[n];
        for (int i = 0; i < n; i++) {
            month[i] = in.nextInt();
            salary[i] = in.nextDouble();
        }
        int month39 = in.nextInt();
        int ans = PensionCARE(month, salary, month39);
        System.out.println(ans);
    }
}