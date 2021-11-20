package Cycle.com;

public class Main {
    public static void main(String[] args) {

    }

    // Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static boolean plus(int a, int b) {
        System.out.println("FirstQuestion");
        int sum = a + b;
        if (sum > 10 || sum < 20)
            return true;

        else return false;

    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.


    public static void plus(int a) {
        System.out.println("SecondQuestion");
        if (a >= 0) {
            System.out.println("Число " + a + "положительное");
        } else System.out.println("Число " + a + "отричательное");

    }


    //Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.


    static boolean Three(int a) {
        System.out.println("ThirdQuestion");
        if (a < 0) {
            return true;
        }
        return false;
    }

    // Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;


    public static void Fourth(int string, int number){
    for( int i = 1; i <number; i++){
        System.out.println(i + " " + string);
    }
    }
}



