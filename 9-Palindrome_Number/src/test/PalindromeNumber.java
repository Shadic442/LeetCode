package test;

//import javax.swing.text.html.parser.Parser;

public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String myNumberAsString = Integer.toString(121);
		//int myNumberAsInt = 121;

		PalindromeNumber isAPalindrome = new PalindromeNumber();

		System.out.println(
				"my reversed string : " +
		new StringBuilder("bonjours").
		reverse().
		toString());
		
		System.out.println(
				"1st test whit 121 should be true : " +
		isAPalindrome.isPalindrome(121));
		
		System.out.println(
				"2nd test whit -121 should be false : " +
		isAPalindrome.isPalindrome(-121));
		
		System.out.println(
				"3rd test whit 10 should be false : " +
		isAPalindrome.isPalindrome(10));
	}

	public boolean isPalindrome(int x) {
		//save the received number in to a string
		String receivedNumber = Integer.toString(x);
		
		// copy and reverse the received number
		String reversedNumber = new StringBuilder(receivedNumber).reverse().toString();
		
		// verify if both string are equal 
		if (receivedNumber.equalsIgnoreCase(reversedNumber)) {
			return true;
		}

		return false;

	}
}
