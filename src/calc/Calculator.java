package calc;

public class Calculator {
    public int sum(int a, int b) {
        int sum = a + b;
        return sum;}

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int factorial (int number) {
        int accumulator = 1;
        for (int i = 2; i <= number; i++) {
            accumulator *= i;
        }
    return accumulator;}

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Invalid operation");
            return 0;
        }
        return a / b;
    }
}
