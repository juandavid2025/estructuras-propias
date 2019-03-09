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
			
			result+= ""+ karatsubaR(x,y);
			
		}
		
		return result;
	}
	
	public String karatsubaR(String x,String y) {
		String result="";
		
		int midX=x.length();
		int midY=y.length();
		
		String A = x.substring(0, midX);
		String B = x.substring(midX+1, x.length());
		String C = y.substring(0, midY);
		String D = y.substring(midY+1, y.length());
		
		
		
		return result;
	}
	
}
