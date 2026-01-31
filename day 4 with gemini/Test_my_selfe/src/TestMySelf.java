import java.util.Scanner;
public class TestMySelf {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args)  {

        System.out.println(" ========================================== ");
        System.out.println("little porject to add employees and managers");
        System.out.println(" ========================================== ");
        System.out.print("How many names you want to enter : ");
        int size = input.nextInt();
        Employee[] team = new Employee[size];
        for (int i = 0 ; i < size; i++) {
            System.out.println("\n --- person " + (i+1) + " ---");
            System.out.print("Type ? ( 1- for Employee - 2- for manager :");
            int type = input.nextInt();
            input.nextLine();
            System.out.print("name : ");
            String name = input.nextLine();
            System.out.print("Salary: ");
            double salary = input.nextDouble();
            if (type == 2) {
                System.out.print("Bonus : ");
                double bonus = input.nextDouble();
                team[i] = new Manager(name, salary, bonus);
            }else{
                team[i] = new Employee(name , salary);
            }
        }
        System.out.println(" Company team ");
        for(int i = 0; i < team.length; i++) {
            team[i].printInfo();
            if( team[i] instanceof Manager) {
                ((Manager) team[i]).signPaper();
            }
        }
    }
}
