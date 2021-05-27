public class Main {
    public static String multiplicationTable (int number){
        int a=1, b=1;
        String q="";
        while (a<11){
            System.out.print(number*b+" ");
            a++;
            b++;
        }
        return q;
    }
    public static void main(String args[]){
        for(int i=1;i<11;i++)
            System.out.println(multiplicationTable(i));
    }
}
