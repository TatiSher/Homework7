package skypro;

import java.util.Arrays;

public class Homework7<value> {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();

    }


        //for task1
        public static void printIsEvenNumber ( int number){
            boolean evenNumber = isEvenNumber(number);
            printIsEvenNumberResult(number, evenNumber);
        }

        private static boolean isEvenNumber ( int number){
            return number % 4 == 0 || number % 100 != 0 || number % 400 >= 0;
        }

        private static void printIsEvenNumberResult ( int number, boolean evenNumber){
            if (evenNumber) {
                System.out.println(number + " — високосный год");
            } else {
                System.out.println(number + " — невисокосный год");
            }
        }

        // for task2
        public static void getClientOS ( int clientOS, int year){
            if (clientOS == 0 && year >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке.");
            } else if (clientOS == 0 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке.");
            } else if (clientOS == 1 && year >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else if (clientOS == 1 && year < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке.");
            }
        }

        // for task3

        public static int getDeliveryDays ( int distance){
            if (distance <= 20) {
                return 1;
            } else if (distance > 20 && distance <= 60) {
                return 2;
            } else {
                return 3;
            }
        }

        // for task4
        public static void alarmDuplicate (String str){
            char[] b = str.toCharArray();
            System.out.println(str);

            for (int i = 0; i < b.length - 1; i++) {
                for (int j = i + 1; j < b.length; j++) {
                    if (b[i] == b[j]) {
                        System.out.println("Значение " + j + " повторяется.");
                    } else {
                        System.out.println("Дубликатов нет.");
                    }
                }
            }
        }


        // for task5
        public static void reverseArray ( int[] arr){
            int[] array = {3, 2, 1, 6, 5};
         //   System.out.println(Arrays.toString(arr));
            int temp = arr[0];
            arr[0] = arr[4];
            arr[4] = temp;
            System.out.println(Arrays.toString(array));
        }

    // for task6
    public static int calculateAverage(int average) {
        int days = 30;
        int[] expence = new int[30];
        average = calculateSum(expence) / days;
        System.out.println("Средняя сумма трат за месяц составила " + average + " рублей.");
        return days;
    }

    public static int calculateSum(int[] monthExpense) {
        monthExpense = new int[30];
        monthExpense[0] = 155_002;
        monthExpense[1] = 105_670;
        monthExpense[2] = 190_670;
        monthExpense[3] = 100_670;
        monthExpense[4] = 150_670;
        monthExpense[5] = 150_670;
        monthExpense[6] = 108_670;
        monthExpense[7] = 100_000;
        monthExpense[8] = 100_521;
        monthExpense[9] = 198_670;
        monthExpense[10] = 123_670;
        monthExpense[11] = 100_670;
        monthExpense[12] = 154_670;
        monthExpense[13] = 100_670;
        monthExpense[14] = 154_670;
        monthExpense[15] = 110_670;
        monthExpense[16] = 100_670;
        monthExpense[17] = 100_600;
        monthExpense[18] = 100_010;
        monthExpense[19] = 199_652;
        monthExpense[20] = 100_670;
        monthExpense[21] = 100_670;
        monthExpense[22] = 100_670;
        monthExpense[23] = 100_670;
        monthExpense[24] = 100_670;
        monthExpense[25] = 100_670;
        monthExpense[26] = 100_670;
        monthExpense[27] = 100_670;
        monthExpense[28] = 100_670;
        monthExpense[29] = 100_670;
        int sum = 0;
        for (int i = 0; i < monthExpense.length; i++) {
            sum = sum + monthExpense[i];
            //System.out.println("Траты за месяц составиляют " + sum + "рублей.");
        }
        return sum;
    }

        private static void task1 () {
            int year = 2024;
            printIsEvenNumber(year);
        }


        private static void task2 () {
            int clientOS = 0;
            int year = 2000;
            getClientOS(clientOS, year);
        }

        private static void task3 () {
            int distance = 150;
            System.out.println("Потребуется дней: " + getDeliveryDays(distance));
        }

        private static void task4 () {
            String d = "aabccddefgghiijjkk";
            alarmDuplicate(d);
        }

        private static void task5 () {
            int[] a = {3, 2, 1, 6, 5};
            reverseArray(a);

        }

    private static void task6() {
        int abc = 30;
        calculateAverage(abc);
    }
}

