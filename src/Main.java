public class Main {
    // Задание 1
    public static void main(String[] args) {

        var clientOS = 0;
        var clientOS1 = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Задание 2

        var clientDeviceYear1 = 2002;
        var clientDeviceYear2 = 2017;
        if (clientDeviceYear1 >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear1 < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientDeviceYear2 >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientDeviceYear2 < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        var year = 2021;
        char leapYear = a;
        boolean leapYear1 = a / 4;
        if (year == a) {
        System.out.println("является високосным");
    }
        boolean leapYear2 = a / 400;
        if (year == a) {
        System.out.println("является високосным");
    }
        if (year != a) {
            System.out.println("не является високосным");
        }

        // Задание 4
    var deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется один день");
        }
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется два дня");
        }
        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется три дня");
        }

    // Задание 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
                default:
                    System.out.println("Такого месяца не существует");
        }









