public class Main {
    public static void main(String[] args) {
        int account = 400;
        int amount = 3100;
        int bonus;

        if (amount > 1000) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        int total = account + amount + bonus;

        System.out.println("Размер бонуса " + bonus);
        System.out.println("Сумма на счете " + total);

    }
}