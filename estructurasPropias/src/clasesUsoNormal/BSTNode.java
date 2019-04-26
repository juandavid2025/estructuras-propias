package clasesUsoNormal;

public class BSTNode <K extends Comparable<K>,T>{

   private K key;
   private T element;
   private BSTNode<K,T> father;
   private BSTNode<K,T> right;
   private BSTNode<K,T> left;
   private boolean isRightSon;
   
   public BSTNode(K key,T element) {
	   this.key=key;
	   this.element=element;
   }
   
   public void setRightSon(boolean value) {
	   isRightSon=value;
   }
   
   public boolean getIsRightSon() {
	   return isRightSon;
   }
   
   public void setFather(BSTNode<K,T> father) {
	   this.father=father;
   }
   
   public BSTNode<K,T> getFather(){
	   return father;
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

   public BSTNode<K,T> deleteR(){
	   
	   if(leaf()) {
		   return null;
	   }
	   
	   if(right==null) {
		   return left;
	   }
	   else if(left==null) {
		   return right;
	   }
	   else {
		   //tiene los dos hijos
		   
		   BSTNode<K,T> sucesor = minValue(right);
		   
		   if(sucesor!=right && sucesor != left) {
			   if(sucesor.isRightSon) {
				   BSTNode<K,T> temp = sucesor.deleteR();
				   temp.setRightSon(true);
				   sucesor.getFather().setRight(temp);
			   }
			   else {
				   BSTNode<K,T> temp = sucesor.deleteR();
				   temp.setRightSon(false);
				   sucesor.getFather().setLeft(temp); 
			   }
		   }
		   else {
			   sucesor.setLeft(left);
		   }
		   
		   return sucesor;
	   }
	   
   }
   
   public BSTNode<K,T> minValue(BSTNode<K,T> current) {
	   return current.getLeft()==null?current:minValue(current.getLeft());
   }

   public boolean leaf() {
	   if(right==null && left==null) {
		   return true;
	   }else {
		   return false;
	   }
   }
	
}
