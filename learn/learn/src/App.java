import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first Number :");
        var num1 = input.nextDouble();
        System.out.println("Enter the operator ( + , - , * , / ) : ");
        char operator = input.next().charAt(0);
        System.out.println("Enter the second Number : ");
        var num2 = input.nextDouble();
        switch (operator){
            case '+': 
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            break;
            case '-':
                System.out.println(num1 + " - " + num2 + " = " + ( num1 - num2));
            break;
            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
            break;
            case '/':
                if(num2 == 0){
                    System.out.println("Erorr : Divided by Zero !");
                }
                else{
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                }
            break;
        }
        input.close();
    }
}
