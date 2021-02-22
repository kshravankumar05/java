
public class PunctuationCharacters {
	static void countChararcters(String str)
	{
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			 if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' ||        str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':') 
			 {  
				 count++;
			 }
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		String str="Good Morning! Mr. James Potter. Had your breakfast?";
		
		countChararcters(str);

	}

}
