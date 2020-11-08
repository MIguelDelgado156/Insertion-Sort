
public class InsertSort {
	
	
	public static void sort(double[] a, int begin, int end) 
	{
		if((end - begin) >= 1)
		{
			int splitPoint = split(end);
			
			for(int i = begin; i < splitPoint - 1 ; i++)
			{
				for(int j = begin; j < (splitPoint - i) - 1; j++ )
				{
					if(a[j] > a[j+1])
					{
						double temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;
					}
				}
			}
			
			sort(a, begin, splitPoint);
			sort(a, splitPoint + 1, end);
			join(a, begin, splitPoint, end);
		}
	}
	

	
	private static int split(int end)
	{
		return (end - 1);
	}
	
	
	private static void join(double[] a, int begin, int splitPoint, int end)
	{		
		for(int i = splitPoint; i < end; ++i)
		{
			double key = a[i];
			int j = i - 1;
			while ( j >=0 && a[j] > key) {
				a[j+1] = a[j];
				j = j - 1;
			}
			a[j+1] = key;
		}
	}

}
