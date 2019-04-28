import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        int result;
        char operator;
        Roman roman = new Roman();
        String[] parts;

        System.out.println("Введите арифметическую операцию: ");

        try {
        String s1 = scanner.nextLine();

            // Проверяем какую операцию нужно сделать
            // Разделяем строку на 1 и 2 значения

            if (s1.contains("-")) {
                parts = s1.split("-");
                String part1 = parts[0];
                operator = '-';
                String part2 = parts[1];
            } else if(s1.contains("+")) {
                parts = s1.split("\\+");
                String part1 = parts[0];
                operator = '+';
                String part2 = parts[1];
            } else if(s1.contains("*")) {
                parts = s1.split("\\*");
                String part1 = parts[0];
                operator = '*';
                String part2 = parts[1];
            } else if(s1.contains("/")) {
                parts = s1.split("/");
                String part1 = parts[0];
                operator = '/';
                String part2 = parts[1];
            } else {
                throw new IllegalArgumentException("Неверная арифметическая операция.");
            }



        // Проверяем, арабские или латинские символы ввели
        if(     parts[0].equals("I") | parts[0].equals("II") | parts[0].equals("III") |
                parts[0].equals("IV" ) | parts[0].equals("VI") | parts[0].equals("VII") |
                parts[0].equals("VIII") | parts[0].equals("IX") | parts[0].equals("X") |
                parts[1].equals("I") | parts[1].equals("II") | parts[1].equals("III") |
                parts[1].equals("IV" ) | parts[1].equals("VI") | parts[1].equals("VII") |
                parts[1].equals("VIII") | parts[1].equals("IX") | parts[1].equals("X")){

            n1 = roman.decode(parts[0]);
            n2 = roman.decode(parts[1]);
        //    System.out.println("n1Rim "+ n1);
        //    System.out.println("operator " + operator);
        //    System.out.println("n2Rim "+ n2);
        }
        else {
            n1 = Integer.parseInt(parts[0]);
            n2 = Integer.parseInt(parts[1]);

        //    System.out.println("n1 " + n1);
        //    System.out.println("operator " + operator);
        //    System.out.println("n2 " + n2);
        }

        // Производим операцию
        if (operator == '+') {
            result = (n1 + n2);
            System.out.println("Результат: " + result);
        }
        else if (operator == '-') {
            result = (n1 - n2);
            System.out.println("Результат: " + result);
        }
        else if (operator == '*') {
            result = (n1 * n2);
            System.out.println("Результат: " + result);
        }
        else if (operator == '/') {
            result = (n1/n2);
            System.out.println("Результат: " + result);
        }
        else {
            System.out.println("Неверный оператор!");
        }

        } catch (Exception e) {
            System.out.println("Exeption!");
        }
    }


}
