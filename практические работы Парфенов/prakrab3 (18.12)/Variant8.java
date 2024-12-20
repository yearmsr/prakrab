import java.util.Scanner;

public class Variant8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1. Кратность суммы цифр 3
        System.out.print("Введите двузначное число: ");
        int twoDigitNum = scanner.nextInt();

        int sumOfDigits = (twoDigitNum / 10) + (twoDigitNum % 10);

        if (sumOfDigits % 3 == 0) {
            System.out.println("Сумма цифр кратна 3");
        } else {
            System.out.println("Сумма цифр не кратна 3");
        }

        // Задание 2. Большее и меньшее число
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Большее: " + num1);
            System.out.println("Меньшее: " + num2);
        } else if (num2 > num1) {
            System.out.println("Большее: " + num2);
            System.out.println("Меньшее: " + num1);
        } else {
            System.out.println("Числа равны: " + num1);
        }



        // Задание 3. Отличное число из 4
        System.out.print("Введите 4 целых числа через пробел: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if (a == b && b == c && a != d) {
            System.out.println("Порядковый номер отличного числа: 4");
        } else if (a == b && b == d && a != c) {
            System.out.println("Порядковый номер отличного числа: 3");
        } else if (a == c && c == d && a != b) {
            System.out.println("Порядковый номер отличного числа: 2");
        } else if (b == c && c == d && b != a) {
            System.out.println("Порядковый номер отличного числа: 1");
        } else {
            System.out.println("Нет числа, отличного от остальных или более одного.");
        }



        // Задание 4. Вычисление функции 
        System.out.print("Введите x: ");
        double x = scanner.nextDouble();


        double y;
        if (-Math.PI / 2 < x && x < Math.PI / 2) {
            y = (Math.sin(x) + Math.pow(Math.tan(x), 2)) / (3.5 * Math.cos(x));
        } else if (Math.PI/2 < x && x < Math.PI) {
            y = Math.cos(x / 3) / (Math.sin(x) + Math.pow(Math.tan(x), 2));
        } else {
            y = Double.NaN; // Значение не определено
            System.out.println("Значение функции не определено для данного x.");
        }

          if (!Double.isNaN(y)) {
                System.out.println("y = " + y);
            }


        // Задание 5. Принадлежность точки области (см. график)
        System.out.print("Введите x: ");
        int pointX = scanner.nextInt();
        System.out.print("Введите y: ");
        int pointY = scanner.nextInt();

        if (Math.abs(pointX) <= 170 && pointY >= Math.abs(pointX)) {
            System.out.println("Да"); // Точка внутри области
        } else if (Math.abs(pointX) == 170 && pointY == 170 || pointY == Math.abs(pointX)) {
            System.out.println("На границе");
        } else {
            System.out.println("Нет"); // Точка вне области

        }

        scanner.close();
    }
}