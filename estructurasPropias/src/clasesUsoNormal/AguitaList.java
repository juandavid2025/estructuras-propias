package clasesUsoNormal;

public class AguitaList <T> {

	private ListNode<T> first;
	private ListNode<T> last;
	private int elementsAdded;
	
	public AguitaList() {
		elementsAdded=0;
	}
	
	public void add(T element) {
		
		ListNode<T> newLN = new ListNode<T>(element);
		
		if(first==null) {
		first = newLN;
		last = newLN;
		elementsAdded++;
		}
		else {
			
			last.setNext(newLN);
			last=newLN;
			elementsAdded++;
			
		}
		
	}
	
	public void add(int position, T element) {
		
		ListNode<T> newLN = new ListNode<T>(element);
		
      	if(position<elementsAdded) {
      		
      		if(position==0) {
      		
      			newLN.setNext(first);
      			first=newLN;
      			elementsAdded++;
      			
      		} 
      		else {
      			
      			ListNode<T> temp = first;
          		int contador=position;
      			
      			while(contador!=1) {
      				
      				temp.getNext();
      				
      			}
      			
      			newLN.setNext(temp.getNext());
      			temp.setNext(newLN);
      			elementsAdded++;
      		}
      		
      	}	
	}
	
	public void delete(T element) {
		

		
	}
	
	public void delete(int position) {
		
		
		
	}
	
	
	public T get(int position) {
		
        T found=null;
		
	
        
		return found;
		
	}
	
	public int size() {
		return elementsAdded;
	}
	
	public boolean isEmpty() {
		return elementsAdded==0? true:false;
	}
}
