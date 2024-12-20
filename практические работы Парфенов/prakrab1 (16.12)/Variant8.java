import java.util.Scanner;

public class Variant8 {

    public static void main(String[] args) {

        // Задание 1. Среднее арифметическое
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число a: ");
        double a = scanner.nextDouble();
        System.out.print("Введите число b: ");
        double b = scanner.nextDouble();
        double average = (a + b) / 2;
        System.out.println("Среднее арифметическое: " + average);

        // Задание 2. Перестановка значений переменных
        System.out.print("Введите значение A: ");
        int A = scanner.nextInt();
        System.out.print("Введите значение B: ");
        int B = scanner.nextInt();
        System.out.print("Введите значение C: ");
        int C = scanner.nextInt();

        int temp = A;
        A = C;
        C = B;
        B = temp;

        System.out.println("Новые значения: A = " + A + ", B = " + B + ", C = " + C);


        // Задание 3. Перевод градусов Цельсия в Фаренгейты
        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 9 / 5 + 32;
        System.out.println("Температура в градусах Фаренгейта: " + fahrenheit);

        // Задание 4. Вычисление значения функции (пример)
        System.out.print("Введите значение x: ");
        double x = scanner.nextDouble();
        System.out.print("Введите значение a: ");
        double alpha = scanner.nextDouble(); // a как alpha (избегая конфликтов имен) 
        System.out.print("Введите значение c: ");
        double c = scanner.nextDouble();


        double g = c + 24.8;
        double w = Math.sqrt(Math.abs(alpha + x)) + g * x; // пример значений g и w


        if (Math.cos(alpha * x) == 0) {
            System.out.println("Ошибка: деление на ноль. cos(ax) не может быть равен 0.");
        } else {
            double y = (Math.cbrt(x * alpha * x *x + Math.sqrt(Math.abs(alpha+x))) ) / (4 * Math.pow(Math.cos(alpha * x), 2) )+ w;
           System.out.println("Значение функции y: " + y);
        }
         scanner.close();
    }
}