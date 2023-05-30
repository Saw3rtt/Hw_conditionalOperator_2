public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 0;
        int iOs = 0;
        int android = 1;
        if (clientOS == iOs) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС не поддерживается.");
        }

        //task2
        int checkYear = 2015;
        int yearOfIssue = 2015;
        if (clientOS == iOs && yearOfIssue < checkYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == iOs && yearOfIssue >= checkYear) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android && yearOfIssue < checkYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == android && yearOfIssue >= checkYear) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("ОС не поддерживается.");
        }
        //task3
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
        //task4
        int delivery = 1;
        int deliveryDistance = 90;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + delivery);
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней: " + (delivery + 1));
        } else if (deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется дней: " + (delivery + 2));

        } else {
            System.out.println("Доставки нет.");
        }


        //task5
        int monthNumber = 4;
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
                System.out.println("Номер месяца больше 12");
        }

    }
}
