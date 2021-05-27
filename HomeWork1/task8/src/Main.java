public class Main {
    public static void main(String[] args){
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }
    public static void checkSeason(int month){
        if (month==12 || month ==1 || month == 2)
            System.out.println("Зима");
        if (month==3 || month ==4 || month == 5)
            System.out.println("Весна");
        if (month==6 || month ==7 || month == 8)
            System.out.println("Лето");
        if (month==9 || month ==10 || month ==1)
            System.out.println("Осень");
    }
}
