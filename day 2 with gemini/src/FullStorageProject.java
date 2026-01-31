import java.util.Scanner;
public class FullStorageProject {
    static Scanner input = new Scanner(System.in);
    static int N ;
    static String[] products ;
    static double[] prices ;
    public static void main (String [] args){
        boolean  running = true;
        while (running){
            System.out.println("\n =========== main menu ===========");
            System.out.println("1. for customers ( buy items)");
            System.out.println("2. for Manager (change prices )");
            System.out.println("3. exit ");
            System.out.print("Choice a Number : ");
            int choice = getValidInt();
            switch (choice){
                case 1:
                    CustomerMenu();
                break;
                case 2:
                    ManagerMenu();
                break;
                case 3:
                    System.out.println("you closed the app ! ");
                    running = false;
                break;
                default:
                    System.out.println("Wrong choice ! ");
            }
        }
    }
    //=======================================
    //============ the manager section======
    //=====================================
    public static void ManagerMenu(){
        boolean editingRunning = true;
        while ( editingRunning){
            System.out.println("\n ======== Welcome sir ========");
            System.out.println("What do you want to do ?");
            System.out.println("1. Add new items");
            System.out.println("2. Edit prices ");
            System.out.println("3. Return to the main menu");
            System.out.print("Choice a Number : ");
            int choice = getValidInt();
            switch (choice){
                case 1:
                    System.out.print("enter the number of items you want to add : ");
                    int addItems = input.nextInt();
                    products = new String[addItems];
                    prices = new double[addItems];
                    for (int i = 0 ; i < addItems; i++){
                        System.out.print("Enter the porduct name : ");
                        String addProduct = input.next();
                        products[i] = addProduct;
                        System.out.print("Enter the product price : ");
                        double addPrice = getValidDouble();
                        prices[i] = addPrice;
                    }
                    System.out.println("the list has been updated ! ");
                case 2:
                    if ( products == null){
                        System.out.println("The list is empty !");
                        return;
                    }
                    boolean editing = true;
                    System.out.println("the current list :");
                    while ( editing){
                        for (int i = 0 ; i < products.length; i++){
                            System.out.println( (i + 1) + ". " + products[i] + " " + prices[i] + " $");
                        }
                        System.out.println("do you want to change product price ? (Y / N ) : ");
                        String state = input.next();
                        if( state.equalsIgnoreCase("n")){
                            editing = false;
                            editingRunning = false;
                            break;
                        }
                        else if (state.equalsIgnoreCase("y")){
                            System.out.print("the number of the product : ");
                            int selectProduct = getValidInt();
                            System.out.print("enter the new price : ");
                            double newPrice = getValidDouble();
                            prices[selectProduct-1] = newPrice ;
                            System.out.println("The price has been updated ! \n");
                        }
                    }
                break;
                case 3:
                    return;
                default :
                    System.out.println("Wrong number ! ");
                    wait(770);
                continue;
            }
        }
    }
    //====================================
    //========= the customer section======
    //====================================
    public static void CustomerMenu () {
        boolean customer = true;
        while (customer){
            System.out.println("\n ======== Welcom To The Store ========");
            System.out.println("1. Show the list of items");
            System.out.println("2. buy items ");
            System.out.println("3. go back to the main menu ");
            System.out.print("enter a number : ");
            int choice = getValidInt();
            switch(choice){
                case 1:
                    if(products == null){
                        System.out.println("the list is empty wait for the manager to add the items in the system");
                        wait(1000);
                        System.out.println("you will return to the main menu");
                        wait(1500);
                        return;
                    }
                    for ( int i = 0; i < products.length; i++){
                        System.out.println((i + 1) + ". " + products[i] + " " + prices[i] + " $");
                    }
                break;
                case 2:
                    if(products == null){
                        System.out.println("the list is empty wait for the manager to add the items in the system");
                        wait(1600);
                        System.out.println("you will return to the main menu");
                        wait(1000);
                        return;
                    }
                    System.out.println("Enter the product Number");
                    int productNumber = getValidInt();
                    System.out.print("the cost per kilo is : " + prices[productNumber-1] + " how many kilos do you want to buy : ");
                    double kilo = getValidDouble();
                    double total = prices[productNumber-1] * kilo;
                    System.out.println("The total price is : " + total);
                    wait(500);
                    System.out.println("thanks , i wish to see you here agine");
                break;
                case 3:
                    return;
                default:
                    System.out.println("wrong number !");
                    wait(1200);
                continue;
            }
        }
    }
    //==================================
    //========= wait fo dely===========
    //=================================
    public static void wait(int ms){
        try{
            Thread.sleep(ms);
        }
        catch(InterruptedException e){
        }
    }
    //==================================
    //========== to avoid chrash =======
    //==================================
    public static int getValidInt() {
        while(true) {
            try{
                return input.nextInt();
            }
            catch ( Exception e) {
                System.out.println("pleas enter number not letter !");
                System.out.print("try again : ");
                input.next();
                wait(700);
            }
        }
    }
    public static double getValidDouble () {
        while(true){
            try{
                return input.nextDouble();
            }
            catch (Exception e) {
                System.out.println("pleas enter just numbers");
                System.out.print("try again : ");
                input.next();
                wait(700);
            }
        }
    }
}