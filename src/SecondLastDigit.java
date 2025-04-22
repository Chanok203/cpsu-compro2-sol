import java.util.Scanner;

public class SecondLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        number = number / 10;
        System.out.println(number % 10);
    }
}
