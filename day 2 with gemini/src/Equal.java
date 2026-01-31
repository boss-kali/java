import java.util.Scanner;
public class Equal {
    public static void main (String [] args) throws Exception{
        Scanner input = new Scanner(System.in);
        String [] products = {"Apple" , "Banana" , "Mango"};
        System.out.print("What do you want to buy :");
        String custemor = input.nextLine();
        boolean isAvilable = false;
        for ( int i = 0 ; i < products.length; i++){
            if (custemor.equalsIgnoreCase(products[i])){
                isAvilable = true;
                break;
            }
        }
        if(isAvilable){
            System.out.println("the " + custemor + " is avilable ");
        }
        else{
            System.out.println("The " + custemor + " is not avilable");
        }
        input.close();
    }
}
