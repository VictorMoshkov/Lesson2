public class Main {


    public static void main(String[] args) {
        printAnInteger();
        positiveNumber();
        negativeNumber();
        lineNumber();



    }


    //Написать метод, принимающий на вход два целых числа и проверяющий,
// что их сумма лежит в пределах от 10 до 20 (включительно),
// если да – вернуть true, в противном случае – false.

    public static void printAnInteger() {
        int a = 6;
        int b = 14;
        int c = (a + b);
        if (c >= 10 && c <= 20) {
            System.out.println("true");

        } else {
            System.out.println("false");

        }
    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    // Замечание: ноль считаем положительным числом.

    public static void positiveNumber() {
        int x = 7;
        if (x >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }

    }

//Написать метод, которому в качестве параметра передается целое число.
// Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.

    public static void negativeNumber() {
        int k = -5;
        if (k < 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    //Написать метод, которому в качестве аргументов передается строка и число,
    // метод должен отпечатать в консоль указанную строку, указанное количество раз;

    private static void lineNumber() {

        for (int i = 0; i < 5; i++) {
            System.out.println("20 февраля");
        }

    }


}



