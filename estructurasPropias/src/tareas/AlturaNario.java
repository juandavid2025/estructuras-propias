package tareas;

public class AlturaNario {

	
	
	public int altura(NodoNario root) {
		int altura=0;
		
		if(root.getHijosSize()!=0) {
			altura+=alturaR(root);
		}
		
		return altura;
	}
	
	public int alturaR (NodoNario root) {
		int altura=0;
		
		if(root.esHoja()) {
			return 1;
		}else {
			int mayor=0;
			for(int i =0 ;i<root.getHijosSize();i++) {
				altura++;
			int temp = alturaR(root);
			
				if(temp>mayor) {
				mayor=temp;
				}
			
			}
			
			altura+=mayor;
		}
		
		return altura;
	}
	
}
