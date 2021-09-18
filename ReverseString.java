package week2.day2;

public class ReverseString {

	
		public static void main(String[] args) {
			String test = "feeling good";
			char[] arr = test.toCharArray();
			for (int i = 0; i < arr.length; i++) {
		
			System.out.print(arr[i]);
			}
			 System.out.println();
		/* Pseudo Code: 2
		a) Find the length of the string
		b) Traverse through each index from length-1 -> 0 (using loop in reverse direction)
		c) Find the character of the String using its index
		*/
			 int length = test.length();
			 System.out.println("length of string " +length);
		System.out.println();
		for (int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]);
			}
	}
		
	}


