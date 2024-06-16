package bbaDepart;

class Solution {
  public int solution(int N) {
	  int longestGap = 0;
	    int currentGap = 0;
	    
	    // Check if the last bit is 1 (no gaps possible)
	    if ((N &  536870911) == 0) {
	      return 0;
	    }	    
	    while (N > 0) {
	      // Check if the current bit is 0
	      if ((N & 1) == 0) {
	        currentGap++;
	      } else {
	        // Update longestGap if current gap is longer
	        longestGap = (currentGap>longestGap)?currentGap:longestGap;
	        currentGap = 0;
	      }
	      N >>= 1; // Right shift N by 1 to process next bit
	    }
	    
	    return longestGap;
	  }

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println("length is : "+sol.solution(328 ));
	}

}
