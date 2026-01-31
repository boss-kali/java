import java.util.Scanner;
public class DataEntryForStorage {
    public static void main (String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String[] products = new String[3];
        double[] price = new double[3];
        System.out.println("Enter 3 Products and there prices");
        for(int i = 0; i < 3; i++){
            System.out.print("enter the product name : ");
            String Productname = input.next();
            products[i] = Productname;
            System.out.print("Enter the product price : ");
            double ProductPrice = input.nextDouble();
            price[i] = ProductPrice;
        }
        System.out.println("the products and the prices");
        for (int i = 0 ; i < 3 ; i++){
            System.out.println(products[i] + " " + price[i] + " $");
        }
        input.close();
    }
}
