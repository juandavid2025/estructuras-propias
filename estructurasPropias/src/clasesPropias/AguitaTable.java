package clasesPropias;

import java.lang.reflect.Array;
import java.util.Hashtable;

public class AguitaTable <T>{

	private T [] hashTable;
	private int numberOfKeysUsed;
	//private T [] reHashing;
	
	public AguitaTable(Class <T> element) {
		
		hashTable = (T[]) Array.newInstance( element , 100 );
	    numberOfKeysUsed=0;
		
	}
	
	public int hash(int k) {
	
		double A = (Math.sqrt(5)+1)/2;
		int hash = (int) Math.floor((k*A)%1);
		return hash;
		
	}
	
	public void insert(T element) {
		
		
		
	}
	
	public void reHashing() {
		
		
		
	}
	
	
}
