public class Pizza1113 {
    private static final int MAX_TOPPING = 10;
    private final String[] toppings;
    private int totalToppings;

    public Pizza1113() {
        toppings = new String[MAX_TOPPING];
        totalToppings = 0;
    }

    public void addTopping(String topping) {
        if (totalToppings < MAX_TOPPING) {
            toppings[totalToppings] = topping;
            totalToppings++;
        } else {
            System.out.println("ไม่สามารถเพิ่มเครื่องปรุงได้อีกแล้ว (ก็บอกอยู่สูงสุดอยู่ที่ 10 อย่าง)");
        }
    }

    public int getTotalToppings() {
        return totalToppings;
    }

    public int getPrice() {
        return 100 + (totalToppings * 10);
    }

    public void printAllTopping() {
        if (totalToppings == 0) {
            System.out.print("คุณไม่ได้ใส่เครื่องปรุง ก็เอาตามนี้ไป");
        } else {
            System.out.println("จำนวนเครื่องปรุงทั้งหมด ตามด้านล่างนี้เลยคุณลูกค้า ");
            for (int i = 0; i < totalToppings; i++) {
                System.out.println("- " + toppings[i]);
            }
        }
    }
}
