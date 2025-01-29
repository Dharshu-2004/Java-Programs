

public class SumOfSuffixPrefixArray
{
	public static void main(String[] args) {
		
		int[] arr={1,2,3,4};
		int prod=1;int k=0;
		for(int i=0;i<arr.length;i++){
		  prod=1;
		  for(int j=0;j<arr.length;j++){
		      if (i!=j){
		          prod=prod*arr[j];
		      } 
		  }
		   
		   System.out.print(prod+" ");
		}
	}
}