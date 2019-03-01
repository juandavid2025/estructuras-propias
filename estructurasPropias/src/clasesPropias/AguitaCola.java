package clasesPropias;

import java.util.ArrayList;

public class AguitaCola<T> {

	private ArrayList<T> arrayL;
	
 public AguitaCola() {
	 arrayL = new ArrayList<T>();
 } 	
	
 public void offer(T index) {
	 arrayL.add(0,index);
 }
 
 public T poll() {
	 T dato=arrayL.get(arrayL.size()-1);
	 arrayL.remove(arrayL.size()-1);
	 return dato;
 }
 
 public T peek() {
	 return arrayL.get(arrayL.size()-1);
 }
 
 public boolean isEmpty() {
	 return arrayL.isEmpty();
 }
 
}
