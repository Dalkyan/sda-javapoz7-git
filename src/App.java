import calc.Calculator;
import calc.RandomGenerator;

public class App {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

                Calculator myCalculator = new Calculator();
                System.out.println(myCalculator.sum(randomGenerator.getSmallNumber() ,randomGenerator.getBigNumber()));
                System.out.println(myCalculator.subtract(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
                System.out.println(myCalculator.multiply(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
                System.out.println(myCalculator.divide(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
                System.out.println(myCalculator.divide(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
        System.out.println(myCalculator.factorial(randomGenerator.getSmallNumber()));
        System.out.println("hello world");
// TODO ogarnac w wolnej chwili gita
    }
        }

