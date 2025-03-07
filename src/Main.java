public class Main {
    public static void main(String[] args) {
        //camelCase использован думаю все четко
        // Задача 1
        for (int number1To10 = 1; number1To10 <= 10; number1To10++) {
            System.out.println(number1To10);
        }

        // Задача 2
        for (int number10To1 = 10; number10To1 >= 1; number10To1--) {
            System.out.println(number10To1);
        }

        // Задача 3
        for (int evenNumber = 0; evenNumber <= 17; evenNumber += 2) {
            System.out.println(evenNumber);
        }

        // Задача 4
        for (int number10ToNegative10 = 10; number10ToNegative10 >= -10; number10ToNegative10--) {
            System.out.println(number10ToNegative10);
        }

        // Задача 5
        for (int leapYear = 1904; leapYear <= 2096; leapYear += 4) {
            System.out.println(leapYear + " год является високосным");
        }

        // Задача 6
        for (int multipleOf7 = 1; multipleOf7 <= 14; multipleOf7++) {
            System.out.println(multipleOf7 * 7);
        }

        // Задача 7
        for (int powerOf2 = 1; powerOf2 <= 512; powerOf2 *= 2) {
            System.out.println(powerOf2);
        }

        // Задача 8
        int monthlyDeposit = 29000;
        for (int month = 1; month <= 12; month++) {
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (monthlyDeposit * month) + " рублей");
        }

        // Задача 9
        double totalAmount = 0;
        double annualInterestRate = 0.12 / 12; // 12% годовых
        for (int month = 1; month <= 12; month++) {
            totalAmount = (totalAmount + monthlyDeposit) * (1 + annualInterestRate);
            System.out.println("Месяц " + month + ", сумма накоплений равна " + (int)totalAmount + " рублей");
        }

        // Задача 10
        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            System.out.println("2*" + multiplier + "=" + (2 * multiplier));
        }
    }
}
