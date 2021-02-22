package arrays;

public class minelementofArray {
	
	void minelementofArray(int[] data)
	{
		int min=data[0];
		for(int i=0;i<data.length;i++)
		{
			if(data[i]<min)
			{
				min=data[i];
			}
		}
		System.out.println(min);
	}
	public static void main(String args[])
	{
		System.out.print("The min elements of the array is:");
		int[] data =new int[] {5,8,6,4,7};
		minelementofArray p =new minelementofArray();
		p.minelementofArray(data);
	}

}
