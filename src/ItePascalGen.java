import java.math.BigInteger;

/**
 * Created by marble on 4/12/17.
 */
public class ItePascalGen implements PascalGen{
    @Override
    public BigInteger[] generatePascalLine(int n, Counter counter) {
        BigInteger[] one = {BigInteger.valueOf(1), BigInteger.valueOf(1)};
        BigInteger[] two;
        int len_old;
        for(int i = 1; i < n; i++) {
            counter.countUp();
            len_old = one.length;
            two = new BigInteger[len_old+1];
            two[0] = BigInteger.valueOf(1);
            two[two.length-1] = BigInteger.valueOf(1);
            for(int j = 1; j < two.length-1; j++) {
                counter.countUp();
                two[j] = one[j-1].add(one[j]);
            }
            one = two;
        }
        return one;
    }
}
