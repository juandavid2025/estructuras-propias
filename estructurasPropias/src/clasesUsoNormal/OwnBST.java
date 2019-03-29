
package clasesUsoNormal;

public class OwnBST <K extends Comparable<K>,T>{

	public BSTNode<K,T> root;
	
	public void insert(K key,T element) {
		
		BSTNode<K,T> newNode = new BSTNode<K,T>(key,element);
		
		if(root == null) {
			
			// la raiz es nula
			
			root = newNode;
		}
		else {
			
			// la raiz no es nula	
			insertR(root,newNode);
		}
	}
	
	private void insertR(BSTNode<K,T> current,BSTNode<K,T> newNode) {
		
		if(current.compareTo(newNode.getKey())<0) {
			if(current.getRight()==null) {
				current.setRight(newNode);
			}
			else {
				insertR(current.getRight(),newNode);
			}
		}
		else {
			if(current.getLeft()==null) {
				current.setLeft(newNode);
			}
			else {
				insertR(current.getLeft(),newNode);
			}
		}
		
	}
	
	public void delete(K key) {
		
		//*******
		
		if(root!=null) {
			
		}
		
	}
	
	public T search(K key) {
		T found=null;
		
		if(root!=null) {
			found=searchR(root,key);
		}
		
		return found;
	}
	
	private T searchR(BSTNode<K,T> node, K key) {
		T found=null;
		
		if(node!=null) {
			
			if(node.compareTo(key)==0) {
				found=node.getElement();
			}
			else if(node.compareTo(key)<0) {
				
				found=searchR(node.getRight(),key);
				
			}else {
				
				found = searchR(node.getLeft(),key);
				
			}
			
		}
		
		return found;
	}
	
	public boolean isEmpty() {
		if(root==null) {
			return true;
		}else {
			return false;
		}
	}
	
	public String inOrder() {
		String in="";
		
		if(root!=null) {
		in += inOrderR(root);
		}
		return in;
	}
	
	private String inOrderR(BSTNode<K,T> current) {
		String in = "";
		
		if(current!=null) {
			
			in+=inOrderR(current.getLeft());
			in+=current.getElement();
			in+=inOrderR(current.getRight());
		}
		
		return in;
	}
	
	public String preOrder() {
        String pre="";
		
		if(root!=null) {
		pre += preOrderR(root);
		}
		return pre;
	}
	
	private String preOrderR(BSTNode<K,T> current) {
		
        String pre = "";
		
		if(current!=null) {
			
			pre+=current.getElement();
			pre+=preOrderR(current.getLeft());
			pre+=preOrderR(current.getRight());
			
		}
		
		return pre;
		
	}
	
	public String postOrder() {
		
        String pos="";
		
		if(root!=null) {
		pos += postOrderR(root);
		}
		return pos;
		
	}
	
	public String postOrderR(BSTNode<K,T> current) {
		
        String pos = "";
		
		if(current!=null) {
			
			pos+=preOrderR(current.getLeft());
			pos+=preOrderR(current.getRight());
			pos+=current.getElement();
			
		}
		
		return pos;
		
	}
	
}
