
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.print("Введите два числа: ");
        int a = kb.nextInt();
        int b = kb.nextInt();
        int c = Sum(a, b);
        System.out.print("Введите число: ");
        int num = kb.nextInt();
        int power = power(a);
        System.out.print(power);
        System.out.println("%d + %d = %d".formatted(a, b, c));
        System.out.println("%d - %d = %d".formatted(a, b, Diff(a, b)));
        System.out.println("%d * %d = %d".formatted(a, b, Prod(a, b)));
        System.out.println("%d / %d = %f".formatted(a, b, Quot(a, b)));
        System.out.println ("Факториал числа !%d = %d".formatted(num,factorial(num)));
        //System.out.println ("Число %d в степени %d = ".formatted(d, n) + power(d, n));
    }

    static int Sum(int a, int b) {
        int c = a + b;
        return c;
    }

    static int Diff(int a, int b) {
        return a - b;
    }

    static int Prod(int a, int b) {
        //Product - Произведение
        return a * b;
    }

    static double Quot(int a, int b) {
        //Quotient - Частное
        return (double) a / b;
    }

    static long factorial (int a) {
        long c = 1;
        for (int i = 1; i <= a; i++) {
            c = c * i;
        }
        return c;
    }

    static int power (int a) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Введите основание степени: ");
        int result = 1;
        int d = kb.nextInt();
        System.out.println("Введите показатель степени: ");
        int n = kb.nextInt();
        for (int j = 1; j <= n; j++) {
            result = result * d;
        }
        System.out.println(result);
        return result;

    }
}