public class loop
{
    public static void main (String [] args)
    {
        int dice = 3;
        while (dice<=6)
        {
            if(dice<6)
            {
                System.out.println("not yatzy");
            }
            else
            {
                System.out.println("yatzy!");
            }
            dice++;
        }
    }
}