import java.util.Scanner;

public class IndexOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String word = sc.nextLine();

        int idx = msg.indexOf(word);
        int count = 0;
        while (idx != -1) {
            System.out.print((idx + 1) + " ");
            count++;
            idx = msg.indexOf(word, idx + 1);
        }
        if (count == 0) {
            System.out.print("string not found");
        }
        System.out.println();
    }
}
