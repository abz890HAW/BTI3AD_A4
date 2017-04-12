

import java.math.BigInteger;
import java.util.Arrays;

public class PascalschesDreieck {
	
	public Counter PascalschSchnellCounter;
	
	

	public PascalschesDreieck() {
		PascalschSchnellCounter = new Counter();
	}


	public BigInteger[] schnellPascalschesDreieckZeile(int n) {
		BigInteger[] fakultaeten = new BigInteger[n+1];
		fakultaeten[0] = BigInteger.ONE;
		for(int i = 1; i < fakultaeten.length;i++ ){
			fakultaeten[i] = fakultaeten[i-1].multiply(BigInteger.valueOf(i));
			PascalschSchnellCounter.countUp();
		}
		
		BigInteger[] koeffizienten = new BigInteger[n + 1];
		for (int i = 0; i < koeffizienten.length; i++) {
			koeffizienten[i] = fakultaeten[n].divide(fakultaeten[i].multiply(fakultaeten[n-i]));
			PascalschSchnellCounter.countUp();
		}
		return koeffizienten;
	}


	public static void main(String[] args) {
		PascalschesDreieck pas = new PascalschesDreieck();
		pas.PascalschSchnellCounter.resetCount();
		for (int i = 1; i <= 10; i++) {
			BigInteger[] koeff = pas.schnellPascalschesDreieckZeile(i);
			System.out.println(Arrays.toString(koeff));;
		}
		System.out.println("Counter: " + pas.PascalschSchnellCounter.getCount());
	}
}
