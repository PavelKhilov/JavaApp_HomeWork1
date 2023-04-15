import java.util.Scanner;

// Вывести все простые числа от 1 до 1000
// Простые числа - числа которые деляться только на 1 и на само себя без остатка(кроме 1).
public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число границу поиска простых чисел: ");
        int n = scanner.nextInt();
        boolean flag = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                if(i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println(i);
            } else {
                flag = true;
            }
        }
    }
}
