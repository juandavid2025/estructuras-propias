package estrategias;

public class Cerro {

	private long totalStairs;
	
	public long alternatives(long stairs) {
		long options=0;
		
		totalStairs=stairs;
		
		return options;
	}
	
	public long alternativesR(long sum,long stairsRisen, long a, long b) {
		long result=0;
		
		if(stairsRisen==totalStairs) {
			result+= 0;
		}
		else if(sum>stairsRisen) {
			result-= 1;
		}
		else {
			
			result += alternativesR(sum+a+b,stairsRisen+3,b,a+b);
		}
		
		return result;
	}
}
