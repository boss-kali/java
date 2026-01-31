import java.util.Scanner;
//=============================================
//The account info
class BankAccount {
    String name;
    double balance;
    BankAccount ( String n, double b){
        name = n;
        balance = b;
    }
    // to print the account info
    void printInfo () {
         System.out.println("-----------------------------");
        System.out.println("Wellcome Mr." + name);
        System.out.println("Your balance is : " + balance);
        System.out.println("-----------------------------");
    }
    // to do deposit
    void deposit ( double amount ) {
        balance = balance + amount;
        System.out.println("you have deposit : " + amount + " ");
         System.out.println("-----------------------------");
        System.out.println("Your balance is : " + balance);
    }
    // to do withddraw
    void withdraw ( double amountW ) {
        if(balance >= amountW ) {
            balance = balance - amountW ;
            System.out.println("You have withdraw : " + amountW );
             System.out.println("-----------------------------");
            System.out.println("Your balance is : " + balance);
        }else{
            System.out.println("faild : you don't have that amount in you account ! ");
        }
    }
}
//=========================================================
// The actual program
public class BankSystem {
    static Scanner input = new Scanner(System.in);
    public static void main(String [] args){
        BankAccount[] account = new BankAccount[3];
        account[0] = new BankAccount("Sami", 10000);
        account[1] = new BankAccount("ali", 5000);
        account[2] = new BankAccount("Zain", 4000);
        System.out.println("=========================");
        System.out.print("Welcome to Java Bank\nenter you name first : ");
        wait(500);
        String userName = input.next();
        boolean found = false;
        for ( int i = 0 ; i < account.length; i++){
            if (userName.equalsIgnoreCase(account[i].name)){
                found = true;
                boolean running = true;
                while ( running ) {
                    wait(400);
                    System.out.println("\n \t ==== Main Menu ====");
                    System.out.println("1. show your account Information\n2. deposit money\n3. withdraw money\n4. exit");
                    System.out.print("Enter a number : ");
                    int choice = getValidInt();
                    switch ( choice ){
                        case 1:
                            wait(400);
                            account[i].printInfo();
                            wait(1000);
                        break;
                        case 2:
                            wait(400);
                            System.out.print("Enter the amount : ");
                            double amount = getValidDouble();
                            account[i].deposit(amount);
                            wait(1000);
                        break;
                        case 3:
                            wait(400);
                            System.out.print("Enter the amount you want to withdraw :");
                            double amountW = getValidDouble();
                            account[i].withdraw(amountW);
                            wait(1200);
                        break;
                        case 4:
                            wait(400);
                            System.out.println("Nice to see you sir ");
                            wait(1000);
                        return;
                        default :
                        wait(400);
                        System.out.println("wrong number rerty");
                        wait(1000);
                    }
                }
            }
        }
        if (! found){
            System.out.println("Sorry : your name is not in the system");
        }
    }
    //================================================
    //to avoid crash if enter any thing not a number 
    public static double getValidDouble () {
        while(true){
            try{
                return input.nextDouble();
            }
            catch (Exception e) {
                System.out.println("pleas enter just numbers");
                wait(500);
                System.out.print("try again : ");
                input.next();
                wait (600);
            }
        }
    }
    public static int getValidInt () {
        while(true) {
            try {
                return input.nextInt();
            }
            catch (Exception e ){
                System.out.println("pleas enter just a numbers !");
                wait(500);
                System.out.print("try again :");
                input.next();
                wait(600);
            }
        }
    }
    //=========================================
    // for delay between messeges
    public static void wait (int ms) {
        try {
            Thread.sleep(ms);
        }
        catch ( InterruptedException e) {
            e.printStackTrace();
        }
    }
    //==========================================
}