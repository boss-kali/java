public class test {
    public static void main (String [] args){
        int N = 2;
        if ( N <= 0){
            System.out.println("the number must be positive");
        }
        else {
            int fact = 1;
            for ( int counter = 1; counter <= N; counter++ ) {
                fact = fact * counter;
            }
            System.out.println("Factorial of " + N + " is " + fact);
        }


    }
}
