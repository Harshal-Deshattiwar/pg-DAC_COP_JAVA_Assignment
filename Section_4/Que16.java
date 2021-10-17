//16. Write a program to check whether a number is a palindrome or not.
//Note: If reverse of a number is same as that of number , then it is called palindrome. eg. 11, 151, 121,

public class Main {
	
	public static void main(String args[]) {
		int num = 151;
		String s = Integer.toString(Math.abs(num));
		StringBuilder sb = new StringBuilder();
		
		for(int i = s.length()-1; i>=0; i--) 
			sb.append(s.charAt(i));
			
		if (sb.toString().equals(s)) System.out.println("Palindrome!");
		else System.out.println("Not palindrome!");
	}
}
