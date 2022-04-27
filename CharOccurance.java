package Week2.Day1;

public class CharOccurance {
	
	
	public static void main(String[] args)
	{
		String text1="This is test automation training from testleaf";
		char[] charArr = text1.toCharArray();
		int i,count=0;
		
		for(i=0;i<charArr.length;i++)
		{
			if(charArr[i]=='t')
			{
				count=count+1;
			}
			}
		System.out.println("No. Of character t' in " +text1 + " is " +count);
		
	}

}
