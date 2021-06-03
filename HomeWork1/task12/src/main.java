import java.io.IOException;
import java.util.Scanner;

public class main {

    public static int a;
    public static int b;
    public static int num;

    public static Scanner scr = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        num = scr.nextInt();
        int d = 0;

        while(num != 0)
        {
            if((num % 10) % 2 == 0)
                a++;
            else
                b++;

            num /= 10;
        }

        System.out.println("Even: " + a + " Odd: " + b);
    }
}
