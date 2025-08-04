import java.util.Scanner;

public class TestPizza1113 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pizza1113 myPizza = new Pizza1113();

        System.out.print("1 เครื่องปรุง เพิ่ม 10 บาท | อยากได้เครื่องปรุงเท่าไร ใส่มาเลย! (สูงสุดอยู่ที่ 10 อย่าง) : ");
        int n = scanner.nextInt();
        scanner.nextLine(); // เคลียร์บรรทัด

        if (n > 10) {
            System.out.println("ก็บอกว่าใส่ได้แค่ 10 อย่าง เข้าใจ๊?");
            n = 10;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("เครื่องปรุงที่ " + (i + 1) + " > ");
            String topping = scanner.nextLine();
            myPizza.addTopping(topping);
        }

        System.out.println("\n=== และนี่ก็คือพิซซ่าที่แกสั่งไงล่ะ! ===");
        System.out.println("ใช้เครื่องปรุงไปทั้งหมด " + myPizza.getTotalToppings()+" อย่าง");
        myPizza.printAllTopping();
        System.out.println("ราคาพิซซ่าที่หราหรู เป็นจำนวนเงินทั้งหมด " + myPizza.getPrice() + " บาท");

        scanner.close();
    }
}
