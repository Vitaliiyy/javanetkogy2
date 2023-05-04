public class Main {
    public static void main(String[] args) {

        int mainBalance = 100;
        int summaPopolneniy = 1200;
        int bonus = summaPopolneniy / 100;
        int result = mainBalance + summaPopolneniy + bonus;
        int result2 = mainBalance + summaPopolneniy;
        if (summaPopolneniy > 1000) {
            System.out.println(bonus + mainBalance + summaPopolneniy);
        } else {
            System.out.println(result2);
        }


    }
}
