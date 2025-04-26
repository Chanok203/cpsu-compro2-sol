import java.util.Scanner;

public class AlternateJump {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        int[] arr2 = new int[N];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        int idx1 = 0;
        int idx2 = 0;
        int arrayId = 1;
        int count1 = 0;
        int count2 = 0;
        while (true) {
            if ((arrayId == 1 && arr1.length <= idx1)
                    || (arrayId == 2 && arr2.length <= idx2)) {
                break;
            }

            if (arrayId == 1) {
                int val = arr1[idx1];
                count1++;
                System.out.printf("1 %d %d", idx1+1, val);
                System.out.println();
                if (val % 2 == 0) {
                    idx1 += val;
                } else {
                    idx2 += val;
                    arrayId = 2;
                }

            } else if (arrayId == 2) {
                int val = arr2[idx2];
                count2++;
                System.out.printf("2 %d %d", idx2+1, val);
                System.out.println();
                if (val % 2 == 0) {
                    idx2 += val;
                } else {
                    idx1 += val;
                    arrayId = 1;
                }
            }
        }
        System.out.println(count1);
        System.out.println(count2);
    }
}
