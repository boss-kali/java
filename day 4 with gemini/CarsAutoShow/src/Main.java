import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("How many cars do you want to add : ");
        int size = getValidInt();
        Vehicle[] autoShow = new Vehicle[size];
        for (int i = 1; i < size; i++) {
            System.out.print("Enter the Vehicle name : ");
            String name = input.nextLine();
            input.next();
            System.out.println("Vehicle Type");
            System.out.print("1.Standard\t2. Passenger car\n : ");
            int type = getValidInt();
        }

    }

    // =================================================
    // to avoid crashes if enter anything not a number
    public static int getValidInt() {
        while (true) {
            try {
                return input.nextInt();
            } catch (Exception e) {
                System.out.println();
                System.out.println("!! Enter only numbers ");
                System.out.print("Try again: ");
                input.next();
            }
        }
    }

    public static double getValidDouble() {
        while (true) {
            try {
                return input.nextDouble();
            } catch (Exception e) {
                System.out.println();
                System.out.println("!! Enter only numbers");
                System.out.print("Try again: ");
                input.next();
            }
        }
    }
    // =================================================
}
