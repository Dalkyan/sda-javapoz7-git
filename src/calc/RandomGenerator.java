package calc;

import java.util.Random;

public class RandomGenerator {

    private Random random;

    public RandomGenerator() {
        this.random = new Random();
    }

    public int getSmallNumber() {
        return random.nextInt(5)+3;
    }
    public int getBigNumber() {
    return random.nextInt(5)+10;
    }

}
