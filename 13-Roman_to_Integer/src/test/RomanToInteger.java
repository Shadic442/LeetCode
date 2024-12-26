package test;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RomanToInteger romanToInt = new RomanToInteger();

		Map<Character, Integer> romanNum = new HashMap<Character, Integer>();

		romanNum.put('I', 1);
		romanNum.put('V', 5);
		romanNum.put('X', 10);
		romanNum.put('L', 50);
		romanNum.put('C', 100);
		romanNum.put('D', 500);
		romanNum.put('M', 1000);

		System.out.println(romanNum.get('I'));
		System.out.println(romanNum.get('V'));
		System.out.println(romanNum.get('X'));
		System.out.println(romanNum.get('L'));
		System.out.println(romanNum.get('C'));
		System.out.println(romanNum.get('D'));
		System.out.println(romanNum.get('M'));
		
		String roman = "LVI";
		System.out.println("roman length : " + roman.length());
		System.out.println("roman charAt(0) : " + roman.charAt(0));
		/*
		 * for (int i = 0; i < roman.length(); i++) {
		 * System.out.println(roman.charAt(i)); }
		 */
		System.out.println("value of II : " + romanToInt.romanToInt("II"));
		System.out.println("value of III : " + romanToInt.romanToInt("III"));
		System.out.println("value of LVIII : " + romanToInt.romanToInt("LVIII"));
		System.out.println("value of MCMXCIV : " + romanToInt.romanToInt("MCMXCIV"));
	}

	public int romanToInt(String s) {
		int convertedNumber = 0;
		Map<Character, Integer> romanNum = new HashMap<Character, Integer>();

		romanNum.put('I', 1);
		romanNum.put('V', 5);
		romanNum.put('X', 10);
		romanNum.put('L', 50);
		romanNum.put('C', 100);
		romanNum.put('D', 500);
		romanNum.put('M', 1000);

		for (int i = 0; i < s.length() - 1; i++) {
			// Character romanSymbol = s.charAt(i);
			/*
			 * if the value of the roman number charAt(i) is smaller the the roman number at
			 * charAt(i + 1) we substract the number from the total
			 */
			if (romanNum.get(s.charAt(i)) < romanNum.get(s.charAt(i + 1))) {
				convertedNumber -= romanNum.get(s.charAt(i));
				//System.out.println(convertedNumber);
			} else {
				convertedNumber += romanNum.get(s.charAt(i));
				//System.out.println(convertedNumber);
			}
		}
		// add the last number to the total
		return convertedNumber + romanNum.get(s.charAt(s.length() - 1));

	}

}
