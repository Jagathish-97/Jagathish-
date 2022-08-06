package week1.day1;

public class ConvertANegativeNumberToAPositiveNumber {

	public static void main(String[] args) {
		int value =-50;
		if (value<0) {
			System.out.println("is a negative number");
			value=value*-1;
			System.out.println(value);
		}
		else 
			System.out.println("is a poitive number");

	}

}
