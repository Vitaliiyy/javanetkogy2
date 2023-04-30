public class Main {
    public static void Main(String[] args) {

        int mainBalance = 100;
        int summaPopolneniy = 1200;
        int bonus = summaPopolneniy / 100;
        int itog = mainBalance + summaPopolneniy + bonus;
        int itog2 = mainBalance + summaPopolneniy;
        if (summaPopolneniy > 1000) {
            System.out.println(bonus + mainBalance + summaPopolneniy);
        } else {
            System.out.println(itog2);
        }


    }
}