import java.util.Scanner;

public class StringCut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        String c = sc.next();
        // จัดการ no target character found
        if (msg.indexOf(c) == -1) {
            System.out.println("no target character found");
            return; // จบการทำงานของ main
        }
        int start = 0; // จุดเริ่มต้นของแต่ละช่วง
        int stop = 0; // จุดสิ้นสุดของแต่ละช่วง
        int countPrint = 0; // นับจำนวนครั้งการพิมพ์
        int idx = msg.indexOf(c);
        while (idx != -1) {
            stop = idx;
            if (start != stop) {
                String sub = msg.substring(start, stop);
                System.out.println(sub);
                countPrint++;
            }
            start = idx + 1;
            idx = msg.indexOf(c, idx+1);
        }
        // ส่วนที่เหลือ หลังจากตัวคั่น
        stop = msg.length();
        if (start != stop) {
            String sub = msg.substring(start, stop);
            System.out.println(sub);
            countPrint++;
        }
        if (countPrint == 0) {
            System.out.println("no output");
        }
    }
}
