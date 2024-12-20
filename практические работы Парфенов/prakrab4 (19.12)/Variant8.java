import java.util.Scanner;

public class Variant8 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1. Дата предыдущего дня
        System.out.print("Введите день (DD): ");
        int dd = scanner.nextInt();
        System.out.print("Введите месяц (MM): ");
        int mm = scanner.nextInt();

        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (dd < 1 || dd > daysInMonth[mm] || mm < 1 || mm > 12) {
            System.out.println("Неверная дата.");
        } else {
            dd--;
            if (dd == 0) {
                mm--;
                if (mm == 0) {
                    mm = 12;
                }
                dd = daysInMonth[mm];
            }

            System.out.println("Дата предыдущего дня: DD = " + dd + ", MM = " + mm);
        }

        // Задание 2. Возраст (строковое представление)
        System.out.print("Введите возраст (20-69): ");
        int age = scanner.nextInt();

        if (age < 20 || age > 69) {
            System.out.println("Возраст вне диапазона.");
        } else {
            String ageStr = "";
            int tens = age / 10;
            int units = age % 10;

            String[] tensWords = {"", "", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят"};
            String[] unitWords = {"", "один", "два", "три", "четыре", "пять", "шесть", "семь", "восемь", "девять"};
            String[] teenWords = {"десять","одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать", "шестнадцать", "семнадцать","восемнадцать", "девятнадцать"};

             if(units == 0 || age >9 && age < 20){
                    ageStr = teenWords[age-10];
            } else {

            ageStr = tensWords[tens] ;
            if(tens > 1 && units !=0){

             ageStr+= " ";
             }

            ageStr += unitWords[units];
             }
             String yearWord = "";
            if( age%10 == 1 && age !=11) yearWord = " год";
            else if( (age%10 ==2 && age != 12)|| (age%10 ==3 && age!= 13)|| (age%10 ==4&& age!=14) ) yearWord = " года";
            else yearWord =" лет";
            System.out.println(ageStr+yearWord);


        }

        // Задание 3. Элементы окружности
        System.out.print("Введите номер элемента (1-4): ");
        int elementNumber = scanner.nextInt();
        System.out.print("Введите значение элемента: ");
        double elementValue = scanner.nextDouble();

        double r, d, l, s;
        final double PI = 3.14;

        switch (elementNumber) {
            case 1:
                r = elementValue;
                d = 2 * r;
                l = 2 * PI * r;
                s = PI * r * r;
                break;
            case 2:
                d = elementValue;
                r = d / 2;
                l = PI * d;
                s = PI * r * r;
                break;
            case 3:
                l = elementValue;
                r = l / (2 * PI);
                d = 2 * r;
                s = PI * r * r;
                break;
            case 4:
                s = elementValue;
                r = Math.sqrt(s / PI);
                d = 2 * r;
                l = 2 * PI * r;
                break;
            default:
                System.out.println("Неверный номер элемента.");
                return;
        }

        System.out.println("Радиус (R): " + r);
        System.out.println("Диаметр (D): " + d);
        System.out.println("Длина (L): " + l);
        System.out.println("Площадь (S): " + s);


        // Задание 4. Наибольшее целое K, K^2 <= N
        System.out.print("Введите целое число N (> 0): ");
        int n = scanner.nextInt();

        int k = 0;
        while (k * k <= n) {
            k++;
        }
        k--;

        System.out.println("Наибольшее целое K: " + k);



        // Задание 5. Вклад в банке
        System.out.print("Введите процент увеличения вклада (P, 0 < P < 25): ");
        double p = scanner.nextDouble();

        if (p <= 0 || p >= 25) {
            System.out.println("Неверный процент.");
            return;
        }

        double deposit = 1000;
        int months = 0;
        while (deposit <= 1100) {
            deposit += deposit * (p / 100);
            months++;
        }

        System.out.println("Количество месяцев (K): " + months);
        System.out.println("Итоговый размер вклада (S): " + deposit);


        // Задание 6. Цифра 7 в числе
        System.out.print("Введите целое число N (> 0): ");
        n = scanner.nextInt();

        boolean has7 = false;
        int tempN = n;
        while (tempN > 0) {
            if (tempN % 10 == 7) {
                has7 = true;
                break;
            }
            tempN /= 10;
        }

        System.out.println("Цифра 7 в числе: " + has7);


        scanner.close();
    }
}