package arrays;

public class LeftRotationOfArray {
	void LeftRotationOfArr(int [] data,int n)
	{
	for(int i=0;i<n;i++)
		
		{	
		int j,first;
		first=data[0];
		for( j=0;j<data.length-1;j++)
		{
			data[j]=data[j+1];
			//System.out.println(data[j]);
			
		}
		data[j]=first;
		//System.out.println(data[j]);
		}
		for(int i=0;i<data.length;i++)
		{
			System.out.println(data[i]);
		}
		
	}
	
	public static void main(String args[])
	{
		int [] data =new int[] {1,2,3,4,5};
		int n=2;
		LeftRotationOfArray t =new LeftRotationOfArray();
		t.LeftRotationOfArr(data,n);
		
	}

}
