public class Main {
    public static void main(String[] args) {
        int os = 1;
        int year = 2015;

        if (year < 2015) {
            if (os == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }
        } else {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else if (os == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        int Yeard = 2021;

        if ((Yeard % 4 == 0 && Yeard % 100 != 0) || (Yeard % 400 == 0)) {
            System.out.println(Yeard + " год является високосным");
        } else {
            System.out.println(Yeard + " год не является високосным");
        }
        int dist = 95;
        int days = 1;

        if (dist > 20 && dist <= 60) {
            days += 1;
        } else if (dist > 60 && dist <= 100) {
            days += 2;
        }

        System.out.println("Потребуется дней: " + days);
        int month = 12;
        String seas = "";

        switch (month) {
            case 1:
            case 2:
                seas = "зима";
                break;
            case 3:
            case 4:
            case 5:
                seas = "весна";
                break;
            case 6:
            case 7:
            case 8:
                seas = "лето";
                break;
            case 9:
            case 10:
            case 11:
                seas = "осень";
                break;
            case 12:
                seas = "зима";
                break;
            default:
                System.out.println("Ошибка: Недопустимый месяц");
                break;
        }

        System.out.println("Месяц " + month + " принадлежит к сезону " + seas);

    }
}
