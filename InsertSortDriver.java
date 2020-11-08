
public class InsertSortDriver {

	public static void main(String[] args) {
		double[] b = {5,9,4,7,3,2,1,6,8,10};
		
		System.out.println("Array before sort:");
		int i;
		for(i = 0; i < b.length; i++) 
		{
			System.out.print(b[i] + " ");
		}
		
		System.out.println();
		InsertSort.sort(b, 0, b.length);
		System.out.println("Sorted Array Values:");
		for(i = 0; i < b.length; i++)
		{
			System.out.print(b[i] + " ");
		}
		System.out.println();
	}

}
