package tareas;

import java.util.ArrayList;

public class NodoNario<T> {
    private T element;
	private ArrayList<NodoNario<T>> hijos ;
	
	public NodoNario(T element) {
		this.element=element;
		hijos = new ArrayList<NodoNario<T>>();
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public T getHijo(int index) {
		return hijos.get(index).getElement();
	}
	
	public void eliminarHijo(int index) {
		hijos.remove(index);
	}
	
	public boolean esHoja() {
		if(hijos.size()==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getHijosSize() {
		return hijos.size();
	}
}
