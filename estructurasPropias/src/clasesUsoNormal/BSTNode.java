package clasesUsoNormal;

public class BSTNode <K extends Comparable<K>,T>{

   private K key;
   private T element;
   private BSTNode<K,T> right;
   private BSTNode<K,T> left;
   
   public BSTNode(K key,T element) {
	   this.key=key;
	   this.element=element;
   }
   
   public K getKey() {
	return key;
}

public void setKey(K key) {
	this.key = key;
}

public T getElement() {
	return element;
}

public void setElement(T element) {
	this.element = element;
}

public BSTNode<K, T> getRight() {
	return right;
}

public void setRight(BSTNode<K, T> right) {
	this.right = right;
}

public BSTNode<K, T> getLeft() {
	return left;
}

public void setLeft(BSTNode<K, T> left) {
	this.left = left;	
}

public int compareTo(K k) {

		
		if(key.compareTo(k)==0) {
		return 0;	
		}
		else if(key.compareTo(k)<0) {
			
			return -1;
		
		}else {
			return 1;
		}	
	
}

   public BSTNode<K,T> minValue(BSTNode<K,T> current) {
	   return current.getLeft()==null?current:minValue(current.getLeft());
   }
   
   public BSTNode<K,T> deleteR(BSTNode<K,T> root, K key) {
	   
	   if(root==null) {
		   return root;
	   }
	   if(root.compareTo(key)>0) {
		   root.left=deleteR(root.left,key);
	   }
	   else if(root.compareTo(key)<0) {
		   root.right=deleteR(root.right,key);
	   }
	   else {
		   
		   if(root.left==null) {
			   return root.right;
		   }
		   else if(root.right==null) {
			   return root.left;
		   }
		   
		   root.key=minValue(root.right).getKey();
		   root.right= deleteR(root.right,root.key);
	   }
	   return root;
   }
	
}
