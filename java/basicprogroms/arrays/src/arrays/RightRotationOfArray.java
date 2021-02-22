package arrays;

public class RightRotationOfArray {

	void RightRotationOfArr(int[] input,int n)
	{
		int j,last;
		last=input[input.length-1];
		for(int i=0;i<n;i++)
		{
		for(j=0;j<input.length;j++)
		{
			input[j]=input[j+1];
		}
		input[j]=last;
		}
	     for(int i=0;i<input.length;i++)
	      {
		System.out.println(input[i]);
	      }
	    }
	public static void main(String[] args)
	{
		int n=2;
		int[] input =new int []{1,2,3,4,5};
		RightRotationOfArray t =new RightRotationOfArray();
		t.RightRotationOfArr(input,n);
	}
	
}
