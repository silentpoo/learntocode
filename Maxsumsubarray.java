public class Maxsumsubarray {

	public static void main(String[] args) {
	
		int a []  = {2,3,-22,5,11,-8,88};
		System.out.println("max sum of subarray :" +
			Maxsumsubarray.getMaxSum3(a) );
	}
	// O(n3)
	public static int getMaxSum(int[] array) {
		int max =array[0];
		for(int i=0; i<array.length; i++) {
			
			for(int j=i; j<array.length; j++) {
				int sum = 0;
				for(int k=i; k<=j; k++) 
					sum +=array[k];
				
				if (sum > max)
					max = sum;
			}
		}
		return max;
	}
	// O(n2)
	public static int getMaxSum2(int[] array) {
		int max =array[0];
		for(int i=0; i<array.length; i++) {
			int sum = 0;
			for(int j=i; j<array.length; j++) {
				sum +=array[j];				
			}
			if (sum > max)
					max = sum;
		}
		return max;
	}
	
	// O(n)
	
	public static int getMaxSum3(int[] array) {
		int max =array[0];
		int sum =array[0];
		for(int i=1; i<array.length; i++) {
			sum += array[i];
			if(sum < 0) {
				if (array[i] > sum)
					sum = array[i];
			}
			
			if (sum > max)
					max = sum;
		}
		return max;
	}
}

