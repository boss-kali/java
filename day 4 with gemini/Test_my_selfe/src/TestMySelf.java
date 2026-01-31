import java.util.Scanner;
public class TestMySelf {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {

        System.out.println(" ========================================== ");
        System.out.println("little porject to add employees and managers");
        System.out.println(" ========================================== ");
        System.out.print("How many names you want to enter : ");
        int list = input.nextInt();
        Employee[] teamList = new Employee[list];
        System.out.print(" enter a name :");
        String enterdName = input.nextLine();
        input.next();
        System.out.println("enter the salary : ");
        double enterdSalary = input.nextDouble();
        teamList[0] = new Employee(enterdName , enterdSalary);
        Employee P = (Employee) teamList[0];
        P.printInfo();
        for(int i = 0; i < teamList.length; i++){

        }
    }
}
