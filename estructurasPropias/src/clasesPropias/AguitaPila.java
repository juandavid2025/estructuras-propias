package clasesPropias;

import java.util.ArrayList;

public class AguitaPila <T>{
    
	private ArrayList<T> arrayL; 
	
	public AguitaPila() {
		arrayL=new ArrayList<T>();
	}
	
	public T pop() {
		T element=arrayL.get(0);
		arrayL.remove(0);
		return element;
	}
	
	public T peek() {
		return arrayL.get(0);
	}
	
	public void push(T element) {
		arrayL.add(0, element);
	}
	
	public boolean isEmpty() {
		return arrayL.isEmpty();
	}
	
}
