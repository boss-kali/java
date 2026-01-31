import java.util.Scanner;
public class StoreLocator {
    public static void main (String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String[] products = {"Apple" , "Banana" , "Mango"};
        System.out.print("what do you want to but : ");
        String customer = input.nextLine();
        int index = -1;
        boolean available = false;
        for ( int i = 0; i < products.length; i++ ){
            if(customer.equalsIgnoreCase(products[i])){
                index = i +1;
                available = true;
                break;
            }
        }
        if(available){
            System.out.println("the product you want is in " + index + " roof");
        }
        else{
            System.out.println("The product you wnat is not available");
        }

        //roof -> تعني "سقف". الكلمة الأنسب للرف هي shelf أو aisle (ممر).

        input.close();
    }
}
