import java.util.Arrays;

/**
 * Created by marble on 4/12/17.
 */
public class PascalBenchmark {
    public static void main(String[] args) {
        int[] result;
        Counter counter = new Counter();
        PascalGen pascalGen = new RecuPascalGen();
        for(int i = 1; i < 100; i++) {
            System.out.println(Arrays.toString(pascalGen.generatePascalLine(i, counter)));
        }
    }
}
