public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
        public static void task1() {
        System.out.println("Задача 1");
        int bigNumber = 100500;
        byte littleNumber = 77;
        short normNumber = -15000;
        long veryBigNumber = 666999666L;
        float littleAfterPoint = 0.1234567f;
        double manyAfterPoint = 33.11223344556677;
        System.out.println("Зачение переменной bigNumber с типом int равно " + bigNumber);
        System.out.println("Зачение переменной littleNumber с типом byte равно " + littleNumber);
        System.out.println("Зачение переменной normNumber с типом short равно " + normNumber);
        System.out.println("Зачение переменной veryBigNumber с типом long равно " + veryBigNumber);
        System.out.println("Зачение переменной normNumber с типом short равно " + normNumber);
        System.out.println("Зачение переменной littleAfterPoint с типом float равно " + littleAfterPoint);
        System.out.println("Зачение переменной manyAfterPoint с типом double равно " + manyAfterPoint);
        }
        public static void task2() {
        System.out.println("Задача 2");
        float firstNumber = 27.12f;
        long secondNumber = 987678965549L;
        double thirdNumber = 2.786;
        short fourthNumber = 569;
        short fifthNumber = -159;
        short sixthNumber = 27897;
        byte seventhNumber = 67;
        }
        public static void task3() {
        System.out.println("Задача 3");
        byte ludaStudents = 23;
        byte annaStudents = 27;
        byte kateStudents = 30;
        int sumOfStudents = ludaStudents + annaStudents + kateStudents;
        short piecesOfPaper = 480;
        int piecesForOneStudent = piecesOfPaper / sumOfStudents;
        System.out.println("На каждого ученика расчитано " + piecesForOneStudent + " листов бумаги");
        }
        public static void task4() {
        System.out.println("Задача 4");
        byte bottlesForTwoMinutes = 16;
        int bottlesForMinute = bottlesForTwoMinutes / 2;
        int bottlesForTwentyMinutes = bottlesForMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottlesForTwentyMinutes + " штук бутылок");
        int minutesInDay = 60 * 24;
        int bottlesForDay = bottlesForMinute * minutesInDay;
        System.out.println("За сутки машина произвела " + bottlesForDay + " штук бутылок");
        int bottlesForThreeDays = bottlesForDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesForThreeDays + " штук бутылок");
        int bottlesForNonLeapYearFeb = bottlesForDay * 28;
        System.out.println("За февраль високосного года машина произвела " + bottlesForNonLeapYearFeb + " штук бутылок");
        int bottlesForLeapYearFeb = bottlesForDay * 29;
        System.out.println("За февраль невисокосного года машина произвела " + bottlesForLeapYearFeb + " штук бутылок");
        int bottlesForThirtyDaysMonth = bottlesForDay * 30;
        System.out.println("За месяц, в котором тридцать дней, машина произвела " + bottlesForThirtyDaysMonth + " штук бутылок");
        int bottlesForThirtyOneDaysMonth = bottlesForDay * 31;
        System.out.println("За месяц, в котором тридцать один день, машина произвела " + bottlesForThirtyOneDaysMonth + " штук бутылок");
        }
        public static void task5() {
        System.out.println("Задача 5");
        byte numbersOfPots = 120;
        byte whitePaintsForOneClass = 2;
        byte brownPaintsForOneClass = 4;
        int potsForOneClass = whitePaintsForOneClass + brownPaintsForOneClass;
        int numberOfClasses = numbersOfPots / potsForOneClass;
        int numberOfWhitePaints = whitePaintsForOneClass * numberOfClasses;
        int numberOfBrownPaints = brownPaintsForOneClass * numberOfClasses;
        System.out.println("В школе, где " + numberOfClasses + " классов, нужно " + numberOfWhitePaints + " банок белой краски и " + numberOfBrownPaints + " банок коричневой краски");
        }
        public static void task6() {
        System.out.println("Задача 6");
        byte weightOfBanana = 80;
        byte weightOfMilk = 105;
        byte weightOfIceCream = 100;
        byte weightOfEgg = 70;
        byte quantityOfBanana = 5;
        byte quantityOfMilk = 2;
        byte quantityOfIceCream = 2;
        byte quantityOfEgg = 4;
        int grBananas = weightOfBanana * quantityOfBanana;
        int grMilk = weightOfMilk * quantityOfMilk;
        int grIceCream = weightOfIceCream * quantityOfIceCream;
        int grEggs = weightOfEgg * quantityOfEgg;
        int grBreakfast = grBananas + grMilk + grIceCream + grEggs;
        System.out.println("Вес завтрака в граммах - " + grBreakfast + " грамм");
        int grPerKg = 1000;
        float kgBreakfast = (float)grBreakfast / (float) grPerKg;
        System.out.println("Вес завтра в килограммах - " + kgBreakfast + " килограмм.");
        }
        public static void task7() {
        System.out.println("Задача 7");
        short loseWeight = 7000;
        short firstDiet = 250;
        short secondDiet = 500;
        int firstDietDays = loseWeight / firstDiet;
        System.out.println("Потребуется " + firstDietDays + " дней, если худеть на 250 грамм в день");
        int secondDietDays = loseWeight / secondDiet;
        System.out.println("Потребуется " + secondDietDays + " дней, если худеть на 500 грамм в день");
        int averageDays = (firstDietDays + secondDietDays) / 2;
        System.out.println("В среднем потребуется " + averageDays + " дней");
        }
        public static void task8() {
        System.out.println("Задача 8");
        int marySalary = 67760;
        int maryYearIncome = marySalary * 12;
        double newMarySalary = marySalary + (marySalary * 0.1);
        double newMaryIncome = newMarySalary * 12;
        double maryImprove = newMaryIncome - (double) maryYearIncome;
        System.out.println("Маша теперь получает " + newMarySalary + " рублей. Годовой доход вырос на " + maryImprove + " рублей");
        int denSalary = 83690;
        int denYearIncome = denSalary * 12;
        double newDenSalary = denSalary + (denSalary * 0.1);
        double newDenIncome = newDenSalary * 12;
        double denImprove = newDenIncome - (double) denYearIncome;
        System.out.println("Денис теперь получает " + newDenSalary + " рублей. Годовой доход вырос на " + denImprove + " рублей");
        int kristySalary = 76230;
        int kristyYearIncome = kristySalary * 12;
        double newKristySalary = kristySalary + (kristySalary * 0.1);
        double newKristyIncome = newKristySalary * 12;
        double kristyImprove = newKristyIncome - (double) kristyYearIncome;
        System.out.println("Кристина теперь получает " + newKristySalary + " рублей. Годовой доход вырос на " + kristyImprove + " рублей");
        }
}