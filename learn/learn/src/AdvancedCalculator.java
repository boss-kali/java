import java.util.Scanner;

public class AdvancedCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char choice ;
        do{
            System.out.print("Enter the first number :");
            var num1 = input.nextDouble();
            System.out.print("enter operator :");
            char op = input.next().charAt(0);
            System.out.print("Enter the second number :");
            System.out.println("Do you want to perform another calculation ? y/n :");
            choice = input.next().charAt(0);
        }while ( choice == 'y' || choice == 'Y');
        input.close();
    }
}