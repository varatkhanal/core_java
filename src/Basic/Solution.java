package Basic;

class Solution {
    public static int solution(int[] A) {
        // Implement your 
        int largeCount=0;
        int slargeCount=0;
        int largest=A[0],secondLargest = A[0];
        int[][] countArr = new int[A.length/2+1][2];
        int count=0;
        
        for(int i =0; i<A.length/2+1;i++){
            if(A[i]/2>A.length || A[i]>A.length){
            	largest=0;
                continue;
            }     
            largeCount=0;
            for(int j=0; j<A.length;j++){
                if(A[i]==A[A.length-j-1]){
                    largeCount++;
                    countArr[i][0]=A[i];
                    countArr[i][1]=largeCount;
                    largest=A[i];
                }
            }

            // for(int j=0; j<A.length/2;j++)
            //     if(A[A.length-i-1]==A[j] && A[A.length-i-1]!=countArr[j]){
            //         largeCount++;
            //         countArr[count][0]=A[i];
            //         countArr[i][1]=largeCount;
            //         count++
            //     }
            // }
            secondLargest= largest;
            largest = (countArr[i][1]==countArr[i][0])?countArr[i][0]:0;
        }
        
        return secondLargest>largest?secondLargest:largest;
    }
    
    public static void main(String[] args) {
    	int[] A = {7,1,2,8,2};
    	System.out.println(Solution.solution(A));
    }

}
