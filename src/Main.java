public class Main {
    public static void main(String args) {
        int initialBalance = 100; // начальная сумма на счету
        int depositAmount = 1600; // сумма пополнения

        int bonus; // переменная для хранения бонусных рублей

        bonus = depositAmount / 100; // рассчитываем бонусные рубли

        int finalBalance = initialBalance + depositAmount + bonus; // рассчитываем итоговый счет

        System.out.println("Итоговый счет: " + finalBalance + " рублей");
        System.out.println("Бонусные рубли: " + bonus + " рублей");
    }

}
