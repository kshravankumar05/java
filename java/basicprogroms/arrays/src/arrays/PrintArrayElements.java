package arrays;

public class PrintArrayElements {
	public void PrintElements(int [] elements)
	{
		for(int i=0;i<elements.length;i++)
		{
			System.out.print(elements[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int[] elements=new int[] {1,2,3,4,57,};
		PrintArrayElements t= new PrintArrayElements();
		t.PrintElements(elements);
		
	}

}
