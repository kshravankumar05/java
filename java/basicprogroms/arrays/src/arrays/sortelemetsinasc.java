package arrays;

public class sortelemetsinasc
{
	void sortelement(int[] data)
	{
		int temp=0;
		for(int i=0;i<data.length;i++)
		{
			
			for(int j=i+1;j<data.length;j++)
			{
				
				if(data[i]>data[j])
				{
					   temp = data[i];  
	                   data[i] = data[j];  
	                   data[j] = temp; 
				}
			}
			for(int k=0;k<data.length;k++)
			{
				System.out.print(data[k]);
				
			}
			
		}
		
	}
	public static void main(String args[])
	{
		int[] data=new int[] {5,4,2,3,1};
		sortelemetsinasc t=new sortelemetsinasc();
		t.sortelement(data);
	}

}
