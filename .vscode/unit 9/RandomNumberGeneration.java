import java.util.Random;

public class RandomNumberGeneration {
    public static void main(String args[]) {
        Random random = new Random();
        System.out.println(random.nextInt(10));
        System.out.println(random.nextBoolean());
        System.out.println(random.nextDouble(10));
        System.out.println(random.nextFloat(10));

    }
}
