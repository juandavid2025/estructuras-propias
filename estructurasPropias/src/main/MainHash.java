package main;

import clasesPropias.AguitaTable;

public class MainHash {

	private AguitaTable<Integer, String> table;
	
	public MainHash() {
		table = new AguitaTable<Integer,String>();
		
		table.put(12, "juan");
		table.put(98, "ossorio");
		table.put(8, "marco");
		
		System.out.println("removi  "+table.remove(12));
		System.out.println("removi  "+table.remove(12));
		System.out.println("saque  "+table.get(8));
		
	}
	
	public static void main(String[] args) {
		
		MainHash m = new MainHash();
		
	}

}
