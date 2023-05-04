public class Main {
    public static void main(String[] args) {

        int balance = 100;
        int income = 1100;
        int bonus = income / 100;
        int result = balance + income + bonus;
        int resultWithoutBonus = balance + income; // результат без бонусов
        if (income > 1000) {
            System.out.println(result);
        } else {
            System.out.println(resultWithoutBonus);
        }


    }
}
