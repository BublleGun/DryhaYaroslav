import java.io.IOException;
import java.util.Scanner;

public class main {

    public static int a;
    public static int b;
    public static int num;

    public static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        num = scr.nextInt();

        if(num > 0 && num < 99999)
        {
            if (((num/1000)%10)%2==0)
                a++;
            else
                b++;

            if (((num/100)%10)%2==0)
                a++;
            else
                b++;
            if (((num/10)%10)%2==0)
                a++;
            else
                b++;
            if (((num/1)%10)%2==0)
                a++;
            else
                b++;
        }else
        {
            System.out.println("Слишком большое число!!!");
        }


        System.out.println("Even: " + a + " Odd: " + b);
    }
}
