package main;

import estrategias.Karatsuba;

public class MainKaratsuba {

	public MainKaratsuba() {
		
		String x = "123";
		String y = "456";
		
		Karatsuba k = new Karatsuba(x,y);
		
		System.out.println(""+k.karatsuba());
	}
	
	public static void main(String[] args) {
		
		MainKaratsuba m = new MainKaratsuba();
		
	}

}
