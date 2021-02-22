package arrays;

public class ReverseOfArrayELements {
	public void PrintReverseofArr(int [] elements)
	{
		//orginal elements of the array
		System.out.println("orginal of Array Elements are:");
		for(int i=0;i<elements.length;i++)
		{
			System.out.print(elements[i]+" ");
		}
		System.out.println();
		System.out.println("Reverse of Array Elements are:");
		for(int i=elements.length-1;i>=0;i--)
		{
			System.out.print(elements[i]+" ");
		}
	}
	public static void main(String args[])
	{
		
		int[] elements=new int[] {1,2,3,4,57};
		
		ReverseOfArrayELements tp= new ReverseOfArrayELements();
		tp.PrintReverseofArr(elements);
		
	}


}
