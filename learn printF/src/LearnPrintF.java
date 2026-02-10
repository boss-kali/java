public class LearnPrintF {
    public static void main(String[] args) throws Exception {
        // s% for string
        // %d for nubmer like Int
        // %f for numbers like float or double
        // %n new line
        // اذا اردنا التحكم في عدد الفواصل العشرية
        // %.2f يعطي مرتبتين بعد الفاصلة
        String product = "Laptop";
        double price = 1250.5;
        System.out.printf("Product: %s | price: %.2f", product, price);
    }
}
