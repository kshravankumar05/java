package arrays;

public class DuplicateOfArray {
	void DuplicateofArray(int[] values)
	{
		for(int i=0;i<values.length;i++)
		{
			
			for(int j=i+1;j<values.length-1;j++)
			{
				int count=0;
				if(values[i]==values[j])
					count=count++;
					//System.out.print(values[j]+" ");
					System.out.print(count);
			}
		
			
		}
	}
public static void main(String args[])
{
	int [] values=new int [] {1,2,3,4,5,5,3,4,4,8,6};
	DuplicateOfArray t=new DuplicateOfArray();
	t.DuplicateofArray(values);
}
}
