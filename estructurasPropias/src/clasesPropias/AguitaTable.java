package clasesPropias;

import java.lang.reflect.Array;
import java.util.Hashtable;

//falta re hashing
public class AguitaTable <K,T>{

	public final static int STARTED_SIZE=100;
	private double tableSize;
	private T [] hashTable;
	private K [] hastTableKeys;
	private double numberOfKeysUsed;
	private K classKeys;
	
	//private T [] reHashing;
	
	public AguitaTable(Class <K> keys,Class <T> element) {
		
		hashTable = (T[]) Array.newInstance( element , STARTED_SIZE );
		hastTableKeys = (K[]) Array.newInstance( keys , STARTED_SIZE );
	    numberOfKeysUsed=0;
		tableSize=STARTED_SIZE;
		classKeys=(K) keys;
		
	}
	
	public int hash(int k) {
	
		double A = (Math.sqrt(5)+1)/2d;
		int hash = (int) (tableSize*(Math.floor((k*A)%1.0)));
		return hash;
		
	}
	
	public void put(K key,T element) {
		
		int keyL = hash( key.hashCode());
		
		if(hashTable[keyL]==null) {
			hashTable[keyL]=element;
			numberOfKeysUsed++;
		}
		// colision 
		else {
			putR(element,keyL+1);
			numberOfKeysUsed++;
		}
		
		if(numberOfKeysUsed/tableSize>0.50) {
			reHashing();
		}
		
	}
	
	public void putR(T element,int k) {
		
		int key=realValue(k);
		
		if(hashTable[key]==null) {
			hashTable[key]=element;
		}
		// colision 
		else {
			putR(element,key+1);
		}
		
	}

	public int realValue(int k) {
		
		return (int) (k % tableSize);
		
	}
	
	public void reHashing() {
		
		//Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		
		//T [] newarray = (T[]) Array.newInstance( **** , tableSize*3 );
		
		for(int i=0;i<hashTable.length;i++) {
			if(hashTable[i]!=null) {
				
				// y aqui como le pido la key???
				
			}
		}
	}
	
	public boolean isEmpty() {
		if(numberOfKeysUsed==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public T get(K key) {
		T value=null;
		
		if(numberOfKeysUsed!=0) {
			int position=hash(key.hashCode());
			if(hashTable[position].equals(key)) {
				value=hashTable[position];
			}
			//hubo colision
			else {
				value= getR(position+1,key);
			}
		}
		
		return value;
	}
	
	public T getR(int position,K key) {
		
		int posi=realValue(position);
		
		if(hashTable[posi].equals(key)) {
			return hashTable[posi];
		}
		else {
			return getR(position+1,key);
		}
	}
	
	public T remove(K key) {
		
        T value=null;
		
		if(numberOfKeysUsed!=0) {
			int position=hash(key.hashCode());
		
			if(hashTable[position]!=null) {
			
			if(hashTable[position].equals(key)) {
				value=hashTable[position];
			}
			//hubo colision
			else {
				value= removeR(position+1,key);
			}
		}
	}
		
		return value;
		
	}
	
	public T removeR(int position,K key) {
    
		int posi=realValue(position);
		
		if(hashTable[posi]!=null) {

		if(hashTable[posi].equals(key)) {
			T valor=hashTable[posi];
			hashTable[posi]=null;
			numberOfKeysUsed--;
			return valor;
		}
		else {
			return getR(position+1,key);
		}
		}else {
			return null;
		}
	}
	
	/**
	public boolean contains(K key) {
		boolean found=false;
		
		
		
		return found;
	}
	*/
	
	
	
}
