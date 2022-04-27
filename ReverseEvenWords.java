package Week2.Day1;

public class ReverseEvenWords {
	
	public static void main(String[] args)
	{
	
		
		String Data_Str="I am a software tester";
		String[] Data_Fnl = Data_Str.split(" ");
		int i;
		
		for(i=0;i<Data_Fnl.length;i++)
		{
	
			if(i%2!=0)
			{
				char[] chrArray=Data_Fnl[i].toCharArray();
				String rev="";
				
				for(int j=(chrArray.length-1);j>=0;j--)
				{
					rev=rev+chrArray[j];	
				}
				
				Data_Fnl[i]=rev;
				System.out.print(Data_Fnl[i]+" ");
			}
			
			else 
				System.out.print(Data_Fnl[i]+" ");
	
		}
		
	}

}
