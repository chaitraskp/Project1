
public class first2maxvalues {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,34,8,6,4};
		int max1=0;
		int max2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(max1<arr[i])
			{
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i])
			{
				max2=arr[i];
			}
		}
		System.out.println(max1);
		System.out.println(max2);

	}

}
