package HW8;

//Є N клієнтів, яким компанія-виробник має доставити товар. Скільки є можливих маршрутів
//доставлення товару з урахуванням того, що товар доставлятиме одна машина? Використовуючи
//        IntelliJ IDEA, створіть клас Delivery. Напишіть програму, яка розраховуватиме та
//виводитиме на екран кількість можливих варіантів доставлення товару. Для розв'язку задачі,
//використовуйте факторіал N!, що розраховується рекурсією. Поясніть, чому не рекомендується
//використовувати рекурсію для розрахунку факторіала. Вкажіть слабкі місця цього підходу.


public class Delivery {
    public static void main(String[] args) {
        System.out.println("Результат: " + factorial(6));
    }

    static int factorial(int N) {
        if (N == 0 || N == 1) {
            return 1;
        } else {
            return N * factorial(N - 1);
        }
    }
}

