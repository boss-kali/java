import java.util.Scanner;
public class DoorCode {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        int DoorCode = 1337;
        System.out.print("enter the code for the door :");
        int codeEnterd = input.nextInt();
        if ( codeEnterd == DoorCode ){
            System.out.println("the door is open ! ");
        }
        else {
            System.out.println("the code is wrong");
        }
        input.close();
    }    
}
