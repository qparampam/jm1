public class Calculator {

    // Производим расчеты
    public int arithmetic(int x, int y, char operators) {
        switch (operators) {
            case '+':
                return x + y;
            case '-':
                return x - y;
            case '/':
                return x / y;
            case '*':
                return x * y;
            default:
                return 0;
        }
    }
}
