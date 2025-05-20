import java.util.ArrayList;

public class ExampleArrayList {
    public static void main(String[] args) {
        // สร้าง ArrayList ที่เก็บค่า Integer
        ArrayList<Integer> list = new ArrayList<Integer>();

        // เพิ่มค่าลงไปใน ArrayList ด้วย method ชื่อ add
        list.add(1);
        list.add(20);

        // พิมพ์ค่าใน ArrayList ออกมาดู
        System.out.println(list);

        // ขนาดของ ArrayList
        System.out.println(list.size());

        // ดึงค่าออกมาด้วย index *** ระวัง OutOfBound
        Integer a = list.get(0);
        System.out.println("a: " + a);

        // ลบค่าด้วย method ชื่อ remove
        // 1. ลบด้วย index
        list.remove(0);
        // 2. ลบด้วยค่า
        list.remove(new Integer(20));

        System.out.println(list);
        

        
    }
}