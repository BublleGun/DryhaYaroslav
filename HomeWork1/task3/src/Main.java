public class Main {
    public static int min(int a, int b){
        int min = a<b ? a:b;
        return min;
    }

    public static void main(String args[]){
        System.out.println(min(12,33));
        System.out.println(min(-20,0));
        System.out.println(min(-10,-20));
    }
}
