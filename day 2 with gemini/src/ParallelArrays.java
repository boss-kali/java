import java.util.Scanner;
public class ParallelArrays {
    public static void main (String [] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String[] products = {"Apple" , "Banana" , "Mango"};
        double[] price = {20.0, 5.00 , 10.0};
        int indexPrice = -1; boolean isFound = false;
        System.out.print("What do you want to buy : ");
        String customer = input.nextLine();
        for( int i = 0 ; i < products.length; i++){
            if(customer.equalsIgnoreCase(products[i])){
                isFound = true;
                indexPrice = i;
                break;
            }
        }
        if(isFound){
            System.out.println("The product is available it cost " + price[indexPrice] +"$");
        }
        else{
            System.out.println("The product is not available ! ");
        }
        input.close();
    }
}
