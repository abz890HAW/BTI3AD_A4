import java.math.BigInteger;

/**
 * Created by Markus Blechschmidt on 4/12/17.
 */
public interface PascalGen {
    /**
     * generate line of fibonacci numbers
     */
    BigInteger[] generatePascalLine(int n, Counter counter);
}
