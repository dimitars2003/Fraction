package Fraction;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int d = scan.nextInt();
		Fraction a = new Fraction (n,d);
		n=scan.nextInt();
		d=scan.nextInt();
		Fraction f = new Fraction(n,d);
		Fraction sb = a.add(f);
		sb.simplify();
		System.out.println(sb.toString());
		Fraction raz = a.substract(f);
		raz.simplify();
		System.out.println(raz.toString());
		Fraction mul = a.multiply(f);
		mul.simplify();
		System.out.println(mul.toString());
		Fraction div = a.divide(f);
		div.simplify();
		System.out.println(div.toString());
		scan.close();
	}

}
