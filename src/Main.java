import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void divideTask() {
        System.out.println("==============================");
    }

    //task1
    public static int checkLeapYear(int year) {
        if (year % 400 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else if (year % 100 == 0) {
            System.out.println(year + " год не является високосным");
        } else if (year % 4 == 0 && year > 1584) {
            System.out.println(year + " год является високосным");
        } else
            System.out.println(year + " год не является високосным");
        return year;
    }

    public static void task1() {
        divideTask();
        System.out.println("task №1");
        LocalDate date = LocalDate.of(2020, 3, 12);
        int year = date.getYear();
        checkLeapYear(year);
        divideTask();
    }


    //task2


    public static void chooseApp(int osType, int year) {
        int currentYear = LocalDate.now().getYear();
        if (osType == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 0 && year >= currentYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (osType == 1 && year >= currentYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {

        System.out.println("task №2");

        LocalDate date = LocalDate.of(2026, 3, 12);
        int makesOfYear = date.getYear();
        int osType = 0;
        chooseApp(osType, makesOfYear);
        divideTask();
    }

    //task3
    public static void calculationDistance(int deliveryDistance) {
        int deliveryTime = 0;
        if (deliveryDistance > 100) {
            System.out.println("Доставки нет.");
        } else if (deliveryDistance >= 60) {
            deliveryTime += 3;
            System.out.println("Доставка займет " + deliveryTime + " суток.");
        } else if (deliveryDistance > 20) {
            deliveryTime += 2;
            System.out.println("Доставка займет " + deliveryTime + " суток.");
        } else if (deliveryDistance <= 20) {
            deliveryTime += 1;
            System.out.println("Доставка займет " + deliveryTime + " сутки");
        }
    }

    public static void task3() {
        System.out.println("task №3");
        int deliveryDistance = 95;
        calculationDistance(deliveryDistance);
        divideTask();
    }

}
