import java.util.Scanner;

public class FirstCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		//whether the triangle is an equilateral triangle or not
		int leftSide = ' ';
		int rightSide = ' ';
		int bottomSide = ' ';
		
		System.out.println("what is the length of leftSide");
		leftSide = keyboard.nextInt();
		System.out.println("what is the length of rightSide");
		rightSide = keyboard.nextInt();
		System.out.println("what is the length of bottomSide");
		bottomSide = keyboard.nextInt();
		
	if (leftSide == rightSide && leftSide == bottomSide) {
		System.out.println("the triangle is equilateral!");
			
		}
	else {
		System.out.println("the triangle is not equilateral!");
	}
				
	}

}
