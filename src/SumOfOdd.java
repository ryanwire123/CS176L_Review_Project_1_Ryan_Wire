import java.util.Scanner;
public class SumOfOdd {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum = 0;
		int currentOddNumber = 1;
		System.out.println("Please enter a positive integer: ");
		int user = in.nextInt();
		System.out.println("The first " + user + " positive integers are: ");
		for(int i = 0; i < user; i++) {
			System.out.print(currentOddNumber + " ");
			sum = sum + currentOddNumber;
			currentOddNumber = currentOddNumber + 2;
		}
		System.out.println(" ");
		System.out.println("The sum of the first " + user + " integers is: ");
		System.out.println(sum);
		
		
		
		

	}

}
