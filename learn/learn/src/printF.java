import java.util.Scanner;
public class printF {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number :");
        var num1 = input.nextInt();
        System.out.print("enter the second number :");
        var num2 = input.nextInt();
        System.out.printf("The first number is: %.2f %n", num1);
        input.close();
    }   
}
