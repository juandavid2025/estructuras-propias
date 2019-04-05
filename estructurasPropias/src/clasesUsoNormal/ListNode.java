package clasesUsoNormal;

public class ListNode<T> {

	private T element;
	private ListNode<T> next;
	
	public ListNode(T element) {
		this.element=element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public ListNode<T> getNext() {
		return next;
	}

	/**
	public void setNext(ListNode<T> next) {
		this.next = next;
	}
*/
	public void setNext(ListNode<T> newLN) {
		// TODO Auto-generated method stub
		next=newLN;
	}
	
	
	
}
