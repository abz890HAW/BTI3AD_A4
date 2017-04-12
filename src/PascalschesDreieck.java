

import java.math.BigInteger;
import java.util.Arrays;

public class PascalschesDreieck {
	
	public long PascalschSchnellCounter = 0;

	public BigInteger[] schnellPascalschesDreieckZeile(int n) {
		BigInteger[] fakultaeten = new BigInteger[n+1];
		fakultaeten[0] = BigInteger.ONE;
		for(int i = 1; i < fakultaeten.length;i++ ){
			fakultaeten[i] = fakultaeten[i-1].multiply(BigInteger.valueOf(i));
			PascalschSchnellCounter++;
		}
		
		BigInteger[] koeffizienten = new BigInteger[n + 1];
		for (int i = 0; i < koeffizienten.length; i++) {
			koeffizienten[i] = fakultaeten[n].divide(fakultaeten[i].multiply(fakultaeten[n-i]));
			PascalschSchnellCounter++;
		}
		return koeffizienten;
	}


	public static void main(String[] args) {
		PascalschesDreieck pas = new PascalschesDreieck();
		for (int i = 1; i <= 10; i++) {
			BigInteger[] koeff = pas.schnellPascalschesDreieckZeile(i);
			System.out.println(Arrays.toString(koeff));;
		}
	}
}
