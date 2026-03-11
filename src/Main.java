class Homework {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
//task1
    public static int checkLeapYear (int year) {
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

        int year = 2028;
       checkLeapYear(year);
    }


//task2
    public static void chooseApp (int osType, int deviceYear){
        if (osType == 0 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (osType == 0 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (osType == 1 && deviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (osType == 1 && deviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }
    public static void task2() {
        int osType = 0;
        int deviceYear = 2018;
       chooseApp(osType,deviceYear);
    }


    public static void task3 {

    }

}
