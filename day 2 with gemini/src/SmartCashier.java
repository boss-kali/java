import java.util.Scanner;
public class SmartCashier {
    public static void main ( String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String[] products = {"Apples" , "Mango" , "Orange"};
        double[] price = {1 , 1.5 , 2};
        System.out.println("Welcome , today we have :");
        for(int i = 0 ; i < products.length; i++){
            System.out.print(products[i] + " \t");
        }
        System.out.println();
        System.out.println("What do you want to buy : ");
        String customer = input.nextLine();
        int indexPrice = -1;
        boolean isRight = false;
        for(int i = 0; i <products.length ; i++){
            if(customer.equalsIgnoreCase(products[i])){
                indexPrice = i;
                isRight = true;
                break;
            }
        }
        double qty; double total;
        if(isRight){
            System.out.print("the product you want cost : " + price[indexPrice] + " per kilio \n How many kilos you want :");
             qty = input.nextDouble();
             total = price[indexPrice] * qty;
            System.out.println("The total is " + total);
        }
        else{
            System.out.println("Sorry you miss speel something or enterd something wrog !");
        }

        input.close();
    }
}
