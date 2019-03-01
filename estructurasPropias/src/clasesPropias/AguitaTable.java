package clasesPropias;

import java.lang.reflect.Array;
import java.util.Hashtable;

public class AguitaTable <T>{

	public final static int STARTED_SIZE=100;
	private int tableSize;
	private T [] hashTable;
	private int numberOfKeysUsed;
	//private T [] reHashing;
	
	public AguitaTable(Class <T> element) {
		
		hashTable = (T[]) Array.newInstance( element , STARTED_SIZE );
	    numberOfKeysUsed=0;
		tableSize=STARTED_SIZE;
	}
	
	public int hash(int k) {
	
		double A = (Math.sqrt(5)+1)/2d;
		int hash = (int) (tableSize*(Math.floor((k*A)%1)));
		return hash;
		
	}
	
	public void put(T element) {
		
		
		
	}
	
	public void reHashing() {
		
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		
	}
	
	public boolean isEmpty() {
		if(numberOfKeysUsed==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public T get() {
		// no yet implemented
		return null;
	}
	
	public T remove() {
		// no yet implemented
		return null;
	}
	
	public boolean contains(T value) {
		boolean found=false;
		
		
		return found;
	}
	
	
	
	
	
}
