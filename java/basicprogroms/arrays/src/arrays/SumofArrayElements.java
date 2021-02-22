package arrays;

public class SumofArrayElements {
	public void SumofArrayElements(int[] digits)
	{
		int sum=0;
		for(int i=0;i<digits.length;i++)
		{
			sum=sum+digits[i];
		}
		System.out.println(" "+sum);
	}
	

	public static void main(String[] args) {
		int [] digits =new int[] {1,2,3,4,5};
		SumofArrayElements v=new SumofArrayElements();
		v.SumofArrayElements(digits);
		
	}

}
