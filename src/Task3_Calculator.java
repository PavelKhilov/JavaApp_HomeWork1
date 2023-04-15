import java.util.Scanner;

// Реализовать простой калькулятор
// Использовать сканнер:
// Scanner scanner = new Scanner(System.in);
// String enter = scanner.next();
// int i = Integer.parseInt(enter);

public class Task3_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.println("Введите оператор действия (+, -, *, /): ");
        String operator = scanner.next();

        System.out.println("Введите второе число: ");
        int secondNumber = scanner.nextInt();

        if (operator.equals("+")) {
            int result = firstNumber + secondNumber;
            System.out.println("Результат: " + result);
        } else if (operator.equals("-")) {
            int result = firstNumber - secondNumber;
            System.out.println("Результат: " + result);
        } else if (operator.equals("*")) {
            int result = firstNumber * secondNumber;
            System.out.println("Результат: " + result);
        } else if (operator.equals("/")) {
            var result = firstNumber / secondNumber;
            System.out.println("Результат: " + result);
        } else {
            throw new RuntimeException("Операция не поддерживается");
//            System.out.println("Такого оператора действия не найдено");
        }
    }
}