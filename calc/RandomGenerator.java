package calc;

import java.util.Random;

public class RandomGenerator {

    private Random random;

    public int randomGenerator() {
        this.random = new Random();
    }

    public int getSmallNumber() {
        return random.nextInt(5);
    }
    public int getBigNumber() {
    return random.nextInt(5)+5;
    }

}
