package week2.day2;

public class SumofdigitsString {

	public static void main(String[] args) {
		//method 1
		//Declare a String text with the following value
		String text = "Tes12Le79af65";
		// Declare a int variable sum
		int sum = 0;
		 //using replaceAll(), replace all the non-digits into
		text = text.replaceAll("[^\\d.]", "");
		// Now, convert the String into array
		char[] ch1 = text.toCharArray();
		//Iterate over the array and get each character
		for(int i = 0;i<ch1.length;i++) {
			//	 * d) Using Character.getNumericValue(), Change the char into int
			int num = Character.getNumericValue(ch1[i]);
			sum = sum + (num % 10);
			
		}
		System.out.println("Method 1 - Sum of given string integer value " +sum);
	}

}
