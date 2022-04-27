package Week2.Day1;

public class FindTypes {

public static void main(String[] args) {
		
		String text="@# hi test for finding data types 007 $$ ";
		char[] charArray = text.toCharArray();
		int length = charArray.length;
		int i,letter=0,num=0,space=0,specialchar=0;
		
		for (i = 0; i < length; i++) 
		{
			if (Character.isLetter(charArray[i]))
				letter++;
			else if (Character.isDigit(charArray[i]))
				num++;
			else if (Character.isSpaceChar(charArray[i]))
				space++;
			else
				specialchar++;
				
		}
		
		
		System.out.println("Charecter : " + letter);
		System.out.println("Blank Space : " + space);
		System.out.println("Integers : " + num);
		System.out.println("Special Charcter : " + specialchar);
		
		
	} 
	

}
