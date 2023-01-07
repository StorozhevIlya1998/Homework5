public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию " +
                    "приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию" +
                    " приложения для Android по ссылке");

        }

    }

    public static void task2() {
        System.out.println("Задание 2");

        int clientOS = 1;
        int clientDeviceYear = 2014;

        if (clientOS == 0) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения" +
                        " для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию " +
                        "приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear > 2015) {
                System.out.println("Установите версию приложения" +
                        " для Android по ссылке");
            } else {
                System.out.println("Установите облегченную версию " +
                        "приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        System.out.println("Задание 3");

        int year = 2021;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задание 4");

        int deliveryDistance = 95;
        int deliveryDays = 0;

        if (deliveryDistance < 20) {
            deliveryDays = 1;
        }else if (deliveryDistance < 60) {
                deliveryDays = 2;
            }else if (deliveryDistance < 100) {
            deliveryDays = 3; }

        if (deliveryDays == 0 ) {
            System.out.println("Доставка не осуществляется");
        }else{
            System.out.println("Потребуется дней " + deliveryDays);


        }
    }
    public static void task5() {
        System.out.println("Задание 5");
        int monthNumber = 12;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Пренадлежит к сезону осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}


