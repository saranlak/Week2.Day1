package Week2.Day1;

public class Palindrome {

	public static void main(String[] args) {
		
	String actual="malayalam";//"madam";
	String reverse="";
			
	
		for(int i=actual.length()-1;i>=0;i--)
		{
		reverse=reverse+actual.charAt(i);
		} 
	
		
	if(actual.equalsIgnoreCase(reverse))
		System.out.println(actual + " is a palindrome ");  
	else
		System.out.println(actual + " is not a palindrome ");
		
		
	
}

}
