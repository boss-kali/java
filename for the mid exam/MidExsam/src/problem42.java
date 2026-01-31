public class problem42 {
    public static void main (String [] args){
        int days = 2, hours = 5, minutes = 45, seconds = 35;
        int total = days * 24;
        total = ( total + hours) * 60;
        total = ( total + minutes) * 60;
        total = (total + seconds);
        System.out.println(total);
    }
    
}
