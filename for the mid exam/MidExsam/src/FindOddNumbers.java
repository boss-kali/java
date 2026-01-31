public class FindOddNumbers {
    public static void main (String [] args){
        int N = 40;
        for(int i = 1; i < N ; i++){
            if( i%2 !=0 ){
                System.out.println(i);
            }
        }
    }
}