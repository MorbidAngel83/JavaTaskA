import java.util.Random;


public class RandomStream 
{
    public static boolean Compare(int dividend, int divider)
    {
        if(dividend % divider == 0)
        {
            return true;
        }
        
        return false;
    }

    public static int RandomNext(int min, int max)
    {
        Random generator = new Random();
        int tmp = max - min;

        return min + generator.nextInt(tmp);
    }

    public static void GenerateStream()
    {
        int min = 50;
        int max = 200;       
        int divider = RandomNext(min, max);

        System.out.println("Liczby podzielne z przedziału: (" + min + "," + max + ")");
        System.out.println("Dzielnik: " + divider);
        for(int i = min; i <= max; i++)
        {
            if(Compare(i, divider))
            {
                System.out.println("Liczba podzielna przez dzielnik: " + i);
            }
        }
    }

    public static void main(String args[])
    {
        GenerateStream();
    }

}
