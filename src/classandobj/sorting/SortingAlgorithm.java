package classandobj.sorting;

public class SortingAlgorithm {
	public void sorting(){
		int[] a ={4,66,38,9,93,104,87,71,2,99};
		int temp=0; 
		
		for(int i=0;i<2;i++)
			{ 
				for(int j=0;j<9;j++){
					if(a[j]>a[j+1]){
						temp=a[j+1];
						a[j+1]=a[j]; 
						a[j]=temp;
					}
					for(int k=0;k<10;k++)
					{
						System.out.print(a[k]+" ");
					}
					System.out.println();
					
				}
				System.out.println("first");
			}
			for(int i=0;i<10;i++)
			{
				System.out.println(a[i]+" ");
			}
		
	}
}
