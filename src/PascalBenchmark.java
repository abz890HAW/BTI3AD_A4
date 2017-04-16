import java.util.Arrays;

/**
 * Created by marble on 4/12/17.
 */
public class PascalBenchmark {
    public static void main(String[] args) {
        int[] result;
        Counter counter = new Counter();
        PascalGen pascalGen = new RecuPascalGen();
        PascalGen[] pascalGens = {
                new RecuPascalGen(),
                new ItePascalGen(),
                new PascalschesDreieck()
        };
        System.out.printf("N reku ite fast\n");
        for(int n = 1; n < 100; n++) {
            System.out.printf("%d", n);
            for(PascalGen gen: pascalGens){
                gen.generatePascalLine(n, counter);
                System.out.printf(" %d", counter.getCount());
                counter.resetCount();
            }
            System.out.printf("\n");
        }
    }
}
