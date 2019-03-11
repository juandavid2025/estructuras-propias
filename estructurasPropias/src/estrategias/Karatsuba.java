package estrategias;

public class Karatsuba {

	private String x;
	private String y;
	
	public Karatsuba(String x,String y) {
		this.x=x;
		this.y=y;
	}
	
	public String karatsuba() {
		String result="";
		
		if(x.length()==1 && y.length()==1) {
		int A = Integer.parseInt(x);
		int B = Integer.parseInt(y);
		
		result=""+A*B;
		}
		
		else {
			
			 result+= processKaratsuba(x,y);
			
		}
		
		return result;
	}
	
	/*
	public String karatsubaR(String x,String y, int hundredthsX, int hundredthsY) {
		String result="";
		
		
		if(x.length()>1 || y.length()>1) {
			
			int midX=x.length();
			int midY=y.length();
			
			String A = x.substring(0, midX);
			String B = x.substring(midX+1, x.length());
			String C = y.substring(0, midY);
			String D = y.substring(midY+1, y.length());
			
			if(A.length()>1 | B.length()>1 | C.length()>1 | D.length()>1) {
			 
			}
			
		}
		else {
			
			
			
		}
	
		
		
		return result;
	}
	*/
	
	public long processKaratsuba(String x, String y) {
		long result=0;
		
		int midX=x.length();
		int midY=y.length();
		
		
		long A = Integer.parseInt(x.substring(0, midX));
		long B = Integer.parseInt(x.substring(midX+1, x.length()));
		long C = Integer.parseInt(y.substring(0, midY));
		long D = Integer.parseInt(y.substring(midY+1, y.length()));
		
		long step1 = B*D;
		long step2 = A*C;
		long step3 = (A+B)*(C+D);
		long step4 = (long) ((step2*Math.pow(100, midX))+(step3*Math.pow(100, midX-1))+step1);
		
		result+= step4;
		
		return result;
	}
	
}
