public class multi { 
    public static void main(String [] args){
        int [][] table = new int [11][11];
        for ( int i = 1; i < table.length; i++){
            for ( int j = 1 ; j < table[i].length; j++ ){
                System.out.print( i + " x " + j + " = " + (table[i][j] = i*j) + " \t");
                table[i-1][j-1] = i*j;
            }
            System.out.println();
            System.out.println(table[5][6]);
        }
    }
}
