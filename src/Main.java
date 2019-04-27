import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1, n2;
        int result;
        char operator;
        Roman roman = new Roman();

        System.out.println("number: ");

        try {
        String s1 = scanner.nextLine();

        // Разделяем предметы друг от друга
        String delimiter = " ";
        String[] subStr = s1.split(delimiter);

        // Проверяем, арабские или латинские символы ввели
        if(     subStr[0].equals("I") | subStr[0].equals("II") | subStr[0].equals("III") |
                subStr[0].equals("IV" ) | subStr[0].equals("VI") | subStr[0].equals("VII") |
                subStr[0].equals("VIII") | subStr[0].equals("IX") | subStr[0].equals("X") |
                subStr[1].equals("I") | subStr[1].equals("II") | subStr[1].equals("III") |
                subStr[1].equals("IV" ) | subStr[1].equals("VI") | subStr[1].equals("VII") |
                subStr[1].equals("VIII") | subStr[1].equals("IX") | subStr[1].equals("X")){

            n1 = roman.decode(subStr[0]);
            operator = subStr[1].charAt(0);
            n2 = roman.decode(subStr[2]);
            System.out.println("n1Rim "+ n1);
            System.out.println("operator " + operator);
            System.out.println("n2Rim "+ n2);
        }
        else {
            n1 = Integer.parseInt(subStr[0]);
            operator = subStr[1].charAt(0);
            n2 = Integer.parseInt(subStr[2]);

            System.out.println("n1 " + n1);
            System.out.println("operator " + operator);
            System.out.println("n2 " + n2);
        }

        // Производим операцию
        if (operator == '+') {
            result = (n1 + n2);
            System.out.println("result: " + result);
        }
        else if (operator == '-') {
            result = (n1 - n2);
            System.out.println("result: " + result);
        }
        else if (operator == '*') {
            result = (n1 * n2);
            System.out.println("result: " + result);
        }
        else if (operator == '/') {
            result = (n1/n2);
            System.out.println("result: " + result);
        }
        else {
            System.out.println("Неверный оператор!");
        }

        } catch (Exception e) {
            System.out.println("Exeption!");
        }

    }


}
