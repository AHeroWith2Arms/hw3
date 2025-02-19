public class Main {
    public static void main(String[] args) {
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        int temp = 4;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }

        int speed = 70;
        if (speed > 60) {System.out.println("Если скорость " + speed + ", то придется заплатить штраф");} else {System.out.println("Если скорость " + speed + ", то можно ездить спокойно");}

        int age2 = 21;
        if (age2 >= 2 && age2 <= 6) {System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в детский сад");} else if (age2 >= 7 && age2 <= 17) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в школу");} else if (age2 >= 18 && age2 <= 24) {
            System.out.println("Если возраст человека равен " + age2 + ", то ему нужно ходить в университет");} else {
            System.out.println("Если возраст человека равен " + age2 + ", то ему пора ходить на работу");}

        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        int seats = 50;
        if (seats < 60) {
            System.out.println("Место в вагоне есть: сидячие/стоячие");
        } else if (seats < 102) {
            System.out.println("Место в вагоне есть: стоячие");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        int one = 5, two = 10, three = 7;
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}
