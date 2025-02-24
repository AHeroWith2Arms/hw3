public class Main {
    public static void main(String[] args) {
        //1 задача
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке.");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
        //2 задача
        int ClientOS = 1;
        int clientDeviceYear = 2015;
        String message;

        if (ClientOS == 0) {
            message = "Установите версию приложения для iOS по ссылке.";
            if (clientDeviceYear < 2015) {
                message = "Установите облегченную версию приложения для iOS по ссылке.";
            }
        } else {
            message = "Установите версию приложения для Android по ссылке.";
            if (clientDeviceYear < 2015) {
                message = "Установите облегченную версию приложения для Android по ссылке.";
            }
        }
        System.out.println(message);
        //3 задача
        int Year = 2021;

        if ((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) {
            System.out.println(Year + " год является високосным");
        } else {
            System.out.println(Year + " год не является високосным");
        }
        //4 задача
        int dist = 95;
        int days = 1;

        if (dist > 20 && dist <= 60) {
            days += 1;
        } else if (dist > 60 && dist <= 100) {
            days += 2;
        }

        System.out.println("Потребуется дней: " + days);
        //5 задача
        int monthNumber = 12;
        String season = "";

        switch (monthNumber) {
            case 1:
            case 2:
                season = "зима";
                break;
            case 3:
            case 4:
            case 5:
                season = "весна";
                break;
            case 6:
            case 7:
            case 8:
                season = "лето";
                break;
            case 9:
            case 10:
            case 11:
                season = "осень";
                break;
            case 12:
                season = "зима";
                break;
            default:
                System.out.println("Ошибка: Недопустимый месяц");
                break;
        }

        System.out.println("Месяц " + monthNumber + " принадлежит к сезону " + season);
    }
}
