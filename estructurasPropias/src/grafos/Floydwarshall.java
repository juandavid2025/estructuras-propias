package grafos;

public class Floydwarshall {

	
	
	public int[][] minimumDistance(int[][] matrix ) {
		
		int[][] copy = matrix.clone();
		
		int sumPibotes=0;
		
		for (int k =0;k<copy.length;k++) {
		
			for(int i=0;i<copy.length;i++) {
				
				for(int j=0;j<copy.length;j++) {
						
				    sumPibotes=copy[i][k]+copy[k][j];
					
				    if(sumPibotes<0) {
				    	 sumPibotes=Integer.MAX_VALUE;
				    }
					
					if(sumPibotes<copy[i][j]) {
						copy[i][j]=sumPibotes;
					}
					
				}
				
			}
			
		}
		return copy;
	}
	
}
