package Fraction;

public class Fraction {

	private int numerator;
	private int denominator;
	public Fraction(int num) {
		numerator=num;
		denominator=1;
	}
	public Fraction() {
		numerator=0;
		denominator=1;
	}
	public Fraction(int num,int den) {
		
		numerator=num;
		if(den!=0) {
			denominator=den;
		}
	}
	public int getNumerator() {
		return(numerator);
	}
	public int getDenominator() {
		return(denominator);
	}
	public int setNumerator(int a) {
		numerator=a;
		return(numerator);
	}
	public int setDenomiator(int a) {
		denominator=a;
		return(denominator);
	}
	public String toString() {
		String str = getNumerator() + " / " + getDenominator();
		return(str);
	}
	public Fraction add(Fraction f) {
		Fraction sbor = new Fraction(f.getDenominator()*numerator+f.getNumerator()*denominator,denominator*f.getDenominator());
		return(sbor);
	}
	public Fraction substract(Fraction f) {
		Fraction raz = new Fraction(f.getDenominator()*numerator-f.getNumerator()*denominator,denominator*f.getDenominator());
		return(raz);
	}
	public Fraction multiply(Fraction f) {
		Fraction mul = new Fraction(numerator*f.getNumerator(),denominator*f.getDenominator());
		return(mul);
	}
	public Fraction divide(Fraction f) {
		Fraction div = new Fraction(numerator*f.getDenominator(),denominator*f.getNumerator());
		return(div);
	}
	public void simplify() {
		int num = numerator;
		int den = denominator;
		while (num != den) {
		    if (num > den) {
		    	num = num - den;
		    }
		    else {
		    	den = den - num;
		    }
		    numerator=numerator/num;
		    denominator=denominator/num;
		}
	}
	
}
