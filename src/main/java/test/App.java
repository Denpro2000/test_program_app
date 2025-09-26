package test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class App {
    public static void main( String[] args) {
        Scanner doing = new Scanner(System.in);
        int chislo;
        String pashalko;
        do {

//            System.out.println("");
            System.out.println("\nЗдарова");
            System.out.println("1 - Проверка четности");
            System.out.println("2 - Наибольшее число");
            System.out.println("3 - Отсчет");
            System.out.println("4 - Создание прямоугольника");
            System.out.println("5 - Калькулятор");
            System.out.println("6 - Числа между");
            System.out.println("0 - Выход");


            pashalko = doing.nextLine();
            if(pashalko.equals("Berserk") ){
                Pashalochka.pashalochka();
                break;
            }else {
                chislo = Integer.parseInt(pashalko);


                switch (chislo) {
                    case 0:
                        System.out.println("Завершение программы");
                        break;
                    case 1:
                        Task1.task1();
                        break;
                    case 2:
                        Task2.task2();
                        break;
                    case 3:
                        Task3.task3();
                        break;
                    case 4:
                        Task4.task4();
                        break;
                    case 5:
                        Task5.task5();
                        break;
                    case 6:
                        Task6.task6();
                        break;
                    default:
                        System.out.println("Неверный выбор");

                }
            }
            chislo = Integer.parseInt(pashalko);
        } while (chislo != 0);
        doing.close();
    }
}
class Pashalochka{
    public static void pashalochka(){
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⣰⣾⠁⠀⢦⣾⣤⠆⠀⠻⣧⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⢠⣼⠏⠀⠀⠀⠀⣿⡇⠀⠀⠀⠈⢷⣄⠀⠀⠀⠀");
        System.out.println("⠀⠀⢀⣸⣿⠃⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⢿⣧⡀⠀⠀");
        System.out.println("⠀⢰⣾⣿⡁⠀⠀⠀⠀⠀⠀⣿⡇⠀⠀⠀⠀⠀⢀⣿⣿⠖⠀");
        System.out.println("⠀⠀⠈⠻⣿⣦⣄⠀⠀⠀⠀⣿⡇⠀⠀⠀⢀⣴⣿⠟⠁⠀⠀");
        System.out.println("⠀⠀⠀⠀⠈⠻⢿⣷⣄⡀⠀⣿⡇⠀⣠⣾⣿⠟⠁⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠙⢿⣿⣦⣿⣧⣾⣿⠟⠁⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⢙⣿⣿⣿⣿⡀⠀⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⢀⣴⣿⣿⣿⣿⣿⣿⣦⡀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⢀⣴⣿⣿⠟⠁⣻⣿⠈⠙⢿⣿⣦⡀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⢀⣴⣿⡿⠋⠀⠀⠀⣽⣿⠀⠀⠀⠙⢿⣿⣦⣄⠀⠀");
        System.out.println("⠀⣠⣴⣿⡿⠋⠀⠀⠀⠀⠀⢼⣿⠀⠀⠀⠀⠀⠈⢻⣿⣷⣄");
        System.out.println("⠈⠙⢿⣿⣦⣄⠀⠀⠀⠀⠀⢸⣿⠀⠀⠀⠀⠀⣠⣾⣿⠟⠁");
        System.out.println("⠀⠀⠀⠙⢿⣿⣷⣄⠀⠀⠀⢸⣿⠀⠀⠀⣠⣾⣿⠟⠁⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠙⢻⣿⣷⡄⠀⢸⣿⠀⠀⣼⣿⣿⠃⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠈⠻⢿⣿⣦⣸⣿⣠⣾⣿⠟⠁⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠈⠙⢿⣿⣿⣿⡿⠁⠀⠀⠀⠀⠀⠀⠀");
        System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⠿⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀");
    }
}
class Task1 {
    public static void task1() {
        System.out.println("Проверка на четность");
        System.out.println("Введите число:");
        Scanner input = new Scanner(System.in);
        int chislo;
        try {
            chislo = input.nextInt();
            if (chislo % 2 == 0) {
                System.out.println("Четное");
            } else {
                System.out.println("Нечетное");
            }
        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}
class Task2 {
    public static void task2(){
        System.out.println("Нахождение наибольшего числа");
        System.out.println("Введите набор чисел");
        Scanner doing = new Scanner(System.in);
        int n = 0;
        String numbers;
        try {
            numbers = doing.nextLine();

            int[] arrayOfNumbers = Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).toArray();

            int max = arrayOfNumbers[0];
            for (int i = 1; i < arrayOfNumbers.length; i++) {
                if(arrayOfNumbers[i]>max){
                    max = arrayOfNumbers[i];
                }
            }
            System.out.println("\nНаибольшее число: "+max);

        }catch (Exception e){
            System.out.println("Ошибка");
        }

    }
}
class Task3{
    public static void task3(){
        System.out.println("Обратный отсчет от вашего числа");
        System.out.println("Введите число: ");
        Scanner doing = new Scanner(System.in);
        try{
            int otschet = doing.nextInt();
            for (int i = 0; i < otschet-1; i++) {
                System.out.println(otschet-i-1);
            }
            System.out.println("Пуск ядерки");
        } catch (Exception e) {
            System.out.println("Ошибка");
        }
    }
}
class Task4{
    public static void task4(){
        System.out.println("Создание прямоугольника");
        Scanner doing = new Scanner(System.in);
        int width;
        int height;
        try {
            System.out.println("Введите ширину");
            width = doing.nextInt();
            System.out.println("Введите высоту");
            height = doing.nextInt();
            for (int i=0; i < height; i++ ){

                for (int j = 0; j < width-1; j++) {
                    System.out.printf("*");
                }
                System.out.println("*");
            }

        } catch (Exception e) {
            System.out.println("Ошибка");
        }


    }
}
class Task5{
    public static void task5(){
        System.out.println("Калькулятор");
        Scanner doing = new Scanner(System.in);
        float firstNumber;
        int operation;
        float secondNumber;
        float result = 0;
        int i = 0;
        float res = 1;
        try{
            System.out.println("Введите первое число");
            firstNumber = doing.nextFloat();
            System.out.println("1 - сложение");
            System.out.println("2 - вычитание");
            System.out.println("3 - умножение");
            System.out.println("4 - деление");
            System.out.println("5 - степень");
            System.out.println("6 - корень");
            System.out.println("Выберите операцию:");
            operation = doing.nextInt();
            if(operation == 6){
                double ressult = result;
                ressult = Math.sqrt(firstNumber);
                System.out.println("Результат: " + ressult);

            } else {
                System.out.println("Введите второе число");
                secondNumber = doing.nextFloat();
                switch (operation) {
                    case 1:
                        result = firstNumber + secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case 2:
                        result = firstNumber - secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case 3:
                        result = firstNumber * secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case 4:
                        result = firstNumber / secondNumber;
                        System.out.println("Результат: " + result);
                        break;
                    case 5:
                        while (i < secondNumber ){
                            res = res*firstNumber;
                            i++;
                        }
                        System.out.println("Результат: " + res);
                        break;


                    default:
                        System.out.println("Неверная операция");


                }
            }


        } catch (Exception e) {
            System.out.println("Ошибка");
        }


    }
}
class Task6{
    public static void task6(){
        Scanner doing = new Scanner(System.in);
        System.out.println("Числа между");
        int firstNumber;
        int secondNumber;
        int max;
        int min;
        int i;

        ArrayList<String> numbers = new ArrayList<String>();
        int lenght;
        int j =0;
        String[] arrayOfNumbers = {"ноль","один","два","три","четыре","пять","шесть","семь","восемь","девять","десять" };
        try {
            System.out.println("Введите первое число(от 1 до 10)");
            firstNumber = doing.nextInt();
            System.out.println("Введите второе число(от 1 до 10)");
            secondNumber = doing.nextInt();
            if (firstNumber < 1 || firstNumber >10 || secondNumber <1 || secondNumber > 10){
                System.out.println("числа не входят в диапазон");
            }else{
                max = Math.max(firstNumber, secondNumber);
                min = Math.min(firstNumber, secondNumber);
                lenght = max-min;

                for( i=max; i>min-1; i--){
                    numbers.add(arrayOfNumbers[i]);


                }
                String result = numbers.toString().replace("[", "").replace("]", "");
                System.out.println(result);

            }

        } catch (Exception e) {
            System.out.println("Ошибка");
        }

    }
}