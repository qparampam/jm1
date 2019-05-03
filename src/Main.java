import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        char operator;
        Roman roman = new Roman();
        RomanNum romanNum = new RomanNum();
        Calculator calculator = new Calculator();
        String[] parts;
        String[] keys = {"-", "+", "*", "/"};

        System.out.println("Введите арифметическую операцию: ");

        try {
            String s1 = scanner.nextLine();
            String s1mod = s1.replaceAll("\\s","");



            // Проверяем какую операцию нужно совершить
            String match = "default";
            for (int i = 0; i < keys.length; i++) {
                if (s1mod.contains(keys[i])) {
                    match = keys[i];
                    break;
                }
            }

            // Разделяем строку на 1 и 2 число
            switch (match) {
                case "-":
                    parts = s1mod.split("-");
                    operator = '-';
                    break;
                case "+":
                    parts = s1mod.split("\\+");
                    operator = '+';
                    break;
                case "*":
                    parts = s1mod.split("\\*");
                    operator = '*';
                    break;
                case "/":
                    parts = s1mod.split("/");
                    operator = '/';
                    break;
                default:
                    throw new IllegalArgumentException("Неверная арифметическая операция.");
            }


            // Проверяем, арабские или латинские символы ввели
            Pattern p = Pattern.compile("^[MDCLXVI]+$");
            Matcher m1 = p.matcher(parts[0]);
            Matcher m2 = p.matcher(parts[1]);

            boolean b = m1.matches() || m2.matches();


            // Производим расчет и выводим на экран
            if(b){
                n1 = roman.decode(parts[0]);
                n2 = roman.decode(parts[1]);

                System.out.println(romanNum.convertToRoman(calculator.arithmetic(n1,n2,operator)));
            }
            else {
                n1 = Integer.parseInt(parts[0]);
                n2 = Integer.parseInt(parts[1]);

                System.out.println(calculator.arithmetic(n1,n2,operator));
            }

        } catch (Exception e) {
            System.out.println("Exeption!");
        }
    }


}
