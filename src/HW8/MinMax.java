package HW8;

//Створіть три перевантажені методи для пошуку середнього арифметичного числа з 3, 4, 5
//змінних, створіть метод для пошуку мінімального, максимального та середнього значень серед
//цих трьох методів.


public class MinMax {
    public static void main(String[] args) {
        double average3 = average(2, 4, 6);
        double average4 = average(2, 4, 6, 10);
        double average5 = average(2, 4, 6, 10, 15);

        System.out.println("Середнє арифметичне 3-х чисел: " + average3);
        System.out.println("Середнє арифметичне 4-х чисел: " + average4);
        System.out.println("Середнє арифметичне 5-ти чисел: " + average5);

        System.out.println("Мінімальне середнє значення: "+max(average3,average4,average5) );
        System.out.println("Максимальне середнє значення: "+min(average3,average4,average5) );
        System.out.println("Середнє значення: " +middle(average3,average4,average5) );

    }

    static int average(int a, int b, int c) {
        int result = (a + b + c) / 3;
        return result;
    }

    static int average(int a, int b, int c, int d) {
        int result = (a + b + c + d) / 4;
        return result;
    }

    static int average(int a, int b, int c, int d, int i) {
        int result = (a + b + c + d + i) / 5;
        return result;
    }

    static double max(double average3, double average4, double average5) {
        return Math.max(Math.max(average3, average4), average5);
    }

    static double min(double average3, double average4, double average5) {
        return Math.min(Math.min(average3, average4), average5);
    }

    static double middle(double average3, double average4, double average5) {
        double maxValue = Math.max(Math.max(average3, average4), average5);
        double minValue = Math.min(Math.min(average3, average4), average5);
        if (average3 != maxValue && average3 != minValue) {
            return average3;
        } else if (average4 != maxValue && average4 !=minValue) {
            return average4;
        } else {
            return average5;
        }

    }
}
