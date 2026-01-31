public class Personstate {
   public static void main(String[] args){
        int age = 18;
        boolean isCitizen = true;
        if ( age >= 18){
            System.out.println("Old enough to vote");
            if (isCitizen){
                System.out.println("and are citien");
            }
            else{
                System.out.println("you must be citizen");
            }
        }
        else{
            System.out.println("not old enough");
        }
    }
}