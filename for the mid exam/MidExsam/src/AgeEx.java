public class AgeEx {
    public static void main (String [] args){
        int [] age = {33 , 55 , 44 , 18 , 66};
        int lowestage = age[0];
        int length = age.length;
        for (int i = 0; i < age.length; i++){
            if( lowestage > age[i]){
                lowestage = age[i];
            }
        }
        System.out.println(lowestage);
    }
    
}
