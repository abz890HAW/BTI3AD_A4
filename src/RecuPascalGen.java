import java.math.BigInteger;

/**
 * Created by Markus Blechschmidt on 4/12/17.
 */
public class RecuPascalGen implements PascalGen {
    private Counter counter;

    @Override
    public BigInteger[] generatePascalLine(int n, Counter counter) {
        this.counter = counter;
        return generatePascalLineReku(n);
    }

    private BigInteger[] generatePascalLineReku(int n) {
        BigInteger fibos[] = new BigInteger[n+1];
        BigInteger fibosBefore[];
        if(1 == n){
            fibos[0] = BigInteger.valueOf(1);
            fibos[1] = BigInteger.valueOf(1);
            counter.countUp();
        }
        else{
            fibosBefore = generatePascalLineReku(n-1);
            fibos[0] = fibosBefore[0];
            fibos[n] = fibosBefore[n-1];
            for(int i = 1; i < n; i++){
                fibos[i] = fibosBefore[i-1].add(fibosBefore[i]);
                counter.countUp();
            }
        }
        return fibos;
    }

}
