public class Main {
    public static int convertToSecond(int hour){
        return hour*3600;
    }
    public static void main(String args[]){
        System.out.println(convertToSecond(5));
        System.out.println(convertToSecond(10));
    }
}
