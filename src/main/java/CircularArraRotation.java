public class CircularArraRotation {
	 public int[] circularArrayRotation(int[] a, int k, int[] queries) {
	     
	   
	      for(int j=0;j<k;j++){
	         int last=a[a.length-1];
	         turnArray(a, last);
	      }
	     	
	     return insertArray(a, queries);
	 }

	private int[] insertArray(int[] a, int[] queries) {
		int[] result = new int[queries.length];
	     for(int i=0;i< result.length;i++)
	    	 result[i] = a[queries[i]];
		return result;
	}

	private void turnArray(int[] a, int last) {
		for(int i=a.length-1;i>=0;i--){
			 if (i == 0){
		           a[0]=last;
		     }
		     else{
		           a[i] = a[i - 1];
		     }
		 }
	}
}
