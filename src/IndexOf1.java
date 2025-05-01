import java.util.Scanner;

public class IndexOf1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String word = sc.nextLine();
        int idx = msg.indexOf(word);
        if (idx == -1) {
            System.out.println("string not found");
        } else {
            System.out.println(idx+1);
        }
    }
}
