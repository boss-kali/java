public class MidExam{
    public static void main ( String [] args){
        int [][] table = new int[11][11];
        for ( int i = 1; i <= 10; i++){
            for ( int j = 1; j <= 10; j++){
                System.out.print(i + " x " + j + " = " + (table[i][j] = i*j)  + " \t");

            }
            System.out.println();
        }
    }
}
