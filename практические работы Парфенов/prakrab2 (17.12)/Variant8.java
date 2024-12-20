import java.util.Scanner;

public class Variant8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1. Перестановка цифр двузначного числа
        System.out.print("Введите двузначное число: ");
        int twoDigitNumber = scanner.nextInt();

        int tens = twoDigitNumber / 10;
        int units = twoDigitNumber % 10;
        int reversedNumber = units * 10 + tens;

        System.out.println("Число с переставленными цифрами: " + reversedNumber);


        // Задание 2. Количество полных минут с начала суток
        System.out.print("Введите количество секунд, прошедших с начала суток: ");
        int totalSeconds = scanner.nextInt();

        int fullMinutes = totalSeconds / 60; 

        System.out.println("Количество полных минут: " + fullMinutes);


        // Задание 3. День недели
        System.out.print("Введите номер дня в году (1-365): ");
        int dayOfYear = scanner.nextInt();

        // 1 января - вторник (день 2)
        int dayOfWeek = (dayOfYear + 1) % 7;  // +1, т.к. 1 января - день 2

         String dayName;
        switch (dayOfWeek) {
            case 1: dayName = "понедельник"; break;
            case 2: dayName = "вторник"; break;
            case 3: dayName = "среда"; break;
            case 4: dayName = "четверг"; break;
            case 5: dayName = "пятница"; break;
            case 6: dayName = "суббота"; break;
            case 0: dayName = "воскресенье"; break;
            default: dayName = "неверный день"; // На случай ошибок (не должно произойти)
        }


        System.out.println("День недели: " + dayName);


        scanner.close();
    }
}