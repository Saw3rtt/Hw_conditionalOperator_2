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
        int year = 2012;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год не является високосным");
        }
        //task4
        int deliveryDistance = 110;
        if(deliveryDistance <= 20){
            System.out.println( "Потребуется дней: "+ 1 + ".");
        }
        else if(deliveryDistance > 20 && deliveryDistance < 60){
            System.out.println( "Потребуется дней: " + 2 + ".");
        }
        else if(deliveryDistance > 60 && deliveryDistance < 100){
            System.out.println( "Потребуется дней: " + 3 + ".");

        }else{
            System.out.println("Доставки нет.");
        }



        //task5
        int monthNumber = 11;
        switch(monthNumber){
            case 1:
                System.out.println("Январь");
                break;
            case 2:
                System.out.println("Февраль");
                break;
            case 3:
                System.out.println("Март");
                break;
            case 4:
                System.out.println("Апрель");
                break;
            case 5:
                System.out.println("Май");
                break;
            case 6:
                System.out.println("Июнь");
                break;
            case 7:
                System.out.println("Июль");
                break;
            case 8:
                System.out.println("Август");
                break;
            case 9:
                System.out.println("Сентябрь");
                break;
            case 10:
                System.out.println("Октябрь");
                break;
            case 11:
                System.out.println("Ноябрь");
                break;
            case 12:
                System.out.println("Декабрь");
                break;
            default:
                System.out.println("Номер месяца больше 12");
        }

}
    }
