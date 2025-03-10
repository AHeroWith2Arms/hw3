public class Main {
    public static void main(String[] args) {
        //1 я  случайно закомитил решение но если расркыть код оно будет видно
        int savings = 0;
        int target = 2459000;
        int monthlyDeposit = 15000;
        int months = 0;

        while (savings < target) {
            months++;
            savings += monthlyDeposit;
            System.out.println("Month " + months + ", total savings is " + savings + " rubles");
        }

        //2
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        for (int j = 10; j >= 1; j--) {
            System.out.print(j + " ");
        }
        System.out.println();

        //3
        int population = 12000000;
        int birthRate = 17;
        int deathRate = 8;

        for (int year = 1; year <= 10; year++) {
            population += (population * birthRate / 1000) - (population * deathRate / 1000);
            System.out.println("Year " + year + ", population is " + population);
        }

        //4
        double deposit = 15000;
        double targetDeposit = 12000000;
        int month = 0;

        while (deposit < targetDeposit) {
            month++;
            deposit *= 1.07;
            if (month % 6 == 0) {
                System.out.println("Month " + month + ", total savings " + deposit);
            }
        }

        //6
        deposit = 15000;
        for (int halfYear = 1; halfYear <= 18; halfYear++) {
            for (int m = 0; m < 6; m++) {
                deposit *= 1.07;
            }
            System.out.println("Half year " + halfYear + ", total savings " + deposit);
        }

        //7
        int firstFriday = 1;
        for (int day = firstFriday; day <= 31; day += 7) {
            System.out.println("Today is Friday, " + day + "-th. Prepare the report.");
        }

        //8
        int startYear = 1823;
        int endYear = 2123;

        for (int year = startYear; year <= endYear; year++) {
            if (year % 79 == 0) {
                System.out.println(year);
            }
        }
    }
}