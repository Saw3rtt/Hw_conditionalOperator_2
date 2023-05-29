public class Main {
    public static void main(String[] args) {
        //task1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task2
        int yearOfIssue = 2016;
        if (clientOS == 0 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && yearOfIssue > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && yearOfIssue < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 1 && yearOfIssue > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        //task3
        int year = 2010;
        if (year % 4 == 0) {
            System.out.println(year + " год является високосным");
        }
        else if (year % 100 == 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
}
    }
