package main;

import java.util.LinkedList;
import java.util.Queue;

import reinado.OwnQueue;

public class Main {

	public Main() {
		
		OwnQueue<String> cola = new OwnQueue<String>();
		cola.offer("hola");
		cola.offer("gg izi");
		System.out.println("salida 1 = "+cola.poll());
		System.out.println("salida 2 = "+cola.poll());
		//System.out.println("salida 3 = "+cola.poll());
	}
	public static void main(String[] args) {
		
		Main m = new Main();
		
	}

}
