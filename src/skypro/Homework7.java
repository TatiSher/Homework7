package skypro;


import java.util.Arrays;

public class Homework7 {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    //for task1
    public static void printIsEvenNumber ( int number){
        boolean evenNumber = isEvenNumber(number);
        printIsEvenNumberResult(number, evenNumber);
    }

    private static boolean isEvenNumber ( int number){
        return (number % 4 == 0 && number % 100 != 0) || number % 400 == 0;
    }

    private static void printIsEvenNumberResult ( int number, boolean evenNumber){
        if (evenNumber) {
            System.out.println(number + " — високосный год");
        } else {
            System.out.println(number + " — невисокосный год");
        }
    }

    // for task2
    public static void getClientOS(int clientOS, int year) {
        if (clientOS == 0) {
            if (year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else
            System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
        } else if (clientOS == 1) {
            if (year >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
    }


    // for task3

    public static int getDeliveryDays (int deliveryDistance){
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
//        System.out.println("Потребуется дней: " + deliveryDays);

        return deliveryDays;
    }

    // for task4
    public static void alarmDuplicate (String str){
        char[] b = str.toCharArray();
        System.out.println(str);

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = i + 1; j < b.length; j++) {
                if (b[i] == b[j]) {
                    System.out.println("Значение " + j + " повторяется.");
                    return;
                }
                    System.out.println("Дубликатов нет.");
            }
        }
    }

    // for task5
    public static void reverseArray(int[] arr) {
        int[] array = {3, 2, 1, 6, 5};
        int a = 0;
        int e = arr.length - 1;
        while (a < e) {
            int temp = arr[a];
            arr[a++] = arr[e];
            arr[e--] = temp;
        }
    }





    private static void task1 () {
        int year = 1900;
        printIsEvenNumber(year);
    }


    private static void task2() {
        int clientOS = 1;
        int year = 2015;
        getClientOS(clientOS, year);
    }

    private static void task3 () {
        int deliveryDistance = 150;
        System.out.println(getDeliveryDays(deliveryDistance));
    }

    private static void task4 () {
        String d = "aabccddefgghiijjkk";
        alarmDuplicate(d);
    }

    private static void task5() {
        int[] a = {3, 2, 1, 6, 5};
        reverseArray(a);
        System.out.println(Arrays.toString(a));
    }



}
