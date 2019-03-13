package estrategias;

import clasesPropias.AguitaTable;

public class Cerro {

	private AguitaTable<Integer,Integer> table;
	
	public Cerro() {
		table= new AguitaTable<Integer,Integer>();
	}
	
	public long fibonachi(long n){
		
		if(n==1) {
			return 1;
		}
		else {
			return fibonachi(n-1) + fibonachi(n-2);
		}
		
	}
	
public long fibonachiDinamico(long n){
		
		if(n==1) {
			return 1;
		}
		else {
			return fibonachi(n-1) + fibonachi(n-2);
		}
		
	}
}
