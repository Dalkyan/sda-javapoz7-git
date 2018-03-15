import calc.Calculator;
import calc.RandomGenerator;

public class App {

    public static void main(String[] args) {
        RandomGenerator randomGenerator = new RandomGenerator();

                Calculator calculator = new Calculator();
                System.out.println(calculator.sum(randomGenerator.getSmallNumber() ,randomGenerator.getBigNumber()));
                System.out.println(calculator.subtract(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
                System.out.println(calculator.multiply(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));
                System.out.println(calculator.divide(randomGenerator.getSmallNumber(),randomGenerator.getBigNumber()));

            }
        }

