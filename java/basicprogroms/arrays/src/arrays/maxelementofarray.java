package arrays;

public class maxelementofarray {
	void maxelementofArray(int[] data)
	{
		int min=data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i]>min)
			{
				min=data[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String args[])
	{
		System.out.print("The max elements of the array is:");
		int[] data =new int[] {5,8,6,4,7,25};
		maxelementofarray p =new maxelementofarray();
		p.maxelementofArray(data);
	}

}
