public class main {
    public static void main(String[] args) {

        int main_balance = 100;
        int summa_popolneniy = 1200;
        int bonus = summa_popolneniy / 100;
        int itog = main_balance + summa_popolneniy + bonus;
        int itog2 = main_balance + summa_popolneniy;
        if (summa_popolneniy > 1000) {
            System.out.println(bonus + main_balance + summa_popolneniy); }
            else {
            System.out.println(itog2);}



    }
}