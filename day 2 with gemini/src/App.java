import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String [] names = {"ali" , "sam" , "zaid"};
        System.out.print("Search a Name : ");
        String search = input.nextLine();
        boolean isFound = false;
        for ( int i = 0 ; i < names.length; i ++){
            if ( search.equals(names[i])){
                isFound = true;
                break;
            }
        }
        if ( isFound ){
            System.out.println("The name is in the system ! ");
        }
        else {
            System.out.println("the name is not in the System !");
        }
        input.close();
        
    }
}
