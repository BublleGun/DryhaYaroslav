import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static int max=100;

    public static void main(String[] args) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "The max is";
        int a=Integer.parseInt(reader.readLine());
        int b=Integer.parseInt(reader.readLine());

        max = Math.max(a,b);
        System.out.println(text + " "+ max);
    }
}
