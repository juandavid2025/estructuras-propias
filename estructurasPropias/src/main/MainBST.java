package main;

import clasesUsoNormal.OwnBST;

public class MainBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OwnBST<Integer,String> bst = new OwnBST<Integer,String>();
		
		bst.insert(8, "8");
		bst.insert(1, " 1 ");
		bst.insert(9, " 9 ");
		bst.insert(78, " 78 ");
		bst.insert(2, " 2 ");
		
		bst.delete(8);
		bst.delete(1);
		bst.delete(9);
		bst.delete(78);
		bst.delete(2);
	
	}

}
