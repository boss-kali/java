import java.util.Scanner;
public class frindsApp {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String[] names = new String[3];
        System.out.println("\n ------------App for Frinds names----------");
        for ( int i = 0; i < names.length ; i++){
            System.out.print("Enter you frind name :");
            names[i] = input.nextLine();
        }
        System.out.println("----------------------------------");
        System.out.println("Your frinds are :");
        for ( int i = 0 ; i < names.length; i ++){
            System.out.print(names[i] + " \t");
        }
        input.close();
    }
    
}
