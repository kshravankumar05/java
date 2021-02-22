package arrays;

public class OddPositionOfElements {
	void OddPosition(int [] values )
	{
		for(int i=0;i<values.length;i=i+2)
		{
			System.out.print(values[i]+" ");
		}
	}
	public static void main(String args[])
	{
		int[] values= new int[] {1,2,3,4,5,7,6,8};
		OddPositionOfElements k= new OddPositionOfElements();
		k.OddPosition(values);
	}

}
