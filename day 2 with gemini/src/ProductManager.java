import java.util.Scanner;
public class ProductManager {
    public static void main (String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String[] products = {"Appels" , "Mangos" , "Oranges"};
        double[] price = {1.5 , 2.0, 3.2};
        System.out.print("What product do you looking for : ");
        String customer = input.nextLine();
        int indexPrice = -1;
        boolean isFound = false;
        for( int i = 0; i < products.length; i++){
            if(customer.equalsIgnoreCase(products[i])){
                isFound = true;
                indexPrice = i;
                break;
            }
        }
        if(isFound){
            System.out.println("The current price of the product is : " + price[indexPrice]);
            System.out.println();
            System.out.print("Entr the new price :");
            double newPrice = input.nextDouble();
            price[indexPrice] = newPrice;
            System.out.println();
            System.out.println("the new price is : " + price[indexPrice]);
        }
        else{
            System.out.println("Sorry we could't find the product it's out of the stock ");
        }
        input.close();
    }
}
