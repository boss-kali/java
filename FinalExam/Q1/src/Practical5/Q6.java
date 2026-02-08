
package Practical5;

public class Q6 {

    public static void main(String args[]) {
        int year = 1999;
        if((year %4 ==0) && (year %100 != 0 || year %400 == 0)){
            System.out.println("It's a leap year");
        }else{
            System.out.println("is not a leap year");
        }
    }
}
