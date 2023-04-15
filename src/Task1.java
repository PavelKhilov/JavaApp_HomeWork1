import java.util.Scanner;

// Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число n: ");
        int n = scanner.nextInt();
        int sum = 0;
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            sum += i;
            factorial *= i;
        }
        System.out.println("Сумма чисел от 1 до n = " + sum);
        System.out.println("Факториал числа n! = " + factorial);
    }
}
