public class Main {
    public static void main(String[] args) {
        //это все мне C++ напоминает... Страшное время было хотя синтаксис почти такой же как и на плюсах
        int iVal = 569;
        byte bVal = 67;
        short sVal = 27897;
        long lVal = 987678965549L;
        float fVal = 27.12f;
        double dVal = 2.786;

        System.out.println("Значение переменной iVal с типом int равно " + iVal);
        System.out.println("Значение переменной bVal с типом byte равно " + bVal);
        System.out.println("Значение переменной sVal с типом short равно " + sVal);
        System.out.println("Значение переменной lVal с типом long равно " + lVal);
        System.out.println("Значение переменной fVal с типом float равно " + fVal);
        System.out.println("Значение переменной dVal с типом double равно " + dVal);

        int lS = 23;
        int aS = 27;
        int eS = 30;
        int tS = lS + aS + eS;
        int tP = 480;
        int pPS = tP / tS;

        System.out.println("На каждого ученика рассчитано " + pPS + " листов бумаги");

        int bPM = 16;
        int m20 = 20;
        int b20M = (bPM / 2) * m20;
        System.out.println("За 20 машина произвела " + b20M + " штук бутылок");

        int mD = 1440;
        int bD = (bPM / 2) * mD;
        System.out.println("За 1 сутки машина произвела " + bD + " штук бутылок");

        int d3 = 3;
        int b3D = bD * d3;
        System.out.println("За 3 дня машина произвела " + b3D + " штук бутылок");

        int dM = 30;
        int bM = bD * dM;
        System.out.println("За 1 месяц машина произвела " + bM + " штук бутылок");
        int cL = 120;
        int bP = 2;
        int kP = 4;
        int cC = cL / (bP + kP);
        int bC = cC * bP;
        int kC = cC * kP;

        System.out.println("В школе, где " + cC + " классов, нужно " + bC + " банок белой краски и " + kC + " банок коричневой краски");

        int bN = 5 * 80;
        int mL = 200 / 100 * 105;
        int iC = 2 * 100;
        int eG = 4 * 70;
        int tW = bN + mL + iC + eG;
        double tWk = tW / 1000.0;

        System.out.println("Вес спортзавтрака: " + tW + " грамм, " + tWk + " килограмм");

        int wL = 7000;
        int pDMin = 250;
        int pDMax = 500;
        int dMin = wL / pDMax;
        int dMax = wL / pDMin;
        int avgD = (dMin + dMax) / 2;

        System.out.println("Дней на похудение при потере 250 грамм в день: " + dMin);
        System.out.println("Дней на похудение при потере 500 грамм в день: " + dMax);
        System.out.println("Среднее количество дней: " + avgD);

        double sM = 67760;
        double sD = 83690;
        double sK = 76230;

        double nSM = sM * 1.1;
        double nSD = sD * 1.1;
        double nSK = sK * 1.1;

        double yIM = sM * 12;
        double yID = sD * 12;
        double yIK = sK * 12;

        double nYIM = nSM * 12;
        double nYID = nSD * 12;
        double nYIK = nSK * 12;

        double dIM = nYIM - yIM;
        double dID = nYID - yID;
        double dIK = nYIK - yIK;

        System.out.println("Маша теперь получает " + nSM + " рублей. Годовой доход вырос на " + dIM + " рублей");
        System.out.println("Денис теперь получает " + nSD + " рублей. Годовой доход вырос на " + dID + " рублей");
        System.out.println("Кристина теперь получает " + nSK + " рублей. Годовой доход вырос на " + dIK + " рублей");
    }
}
