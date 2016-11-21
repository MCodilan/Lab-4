import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #4, Program 2
 *November 9th, 2016
 * 
 */
public class SquareRoot {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		                                                                                                           
		double userNum;
		double userNumRt;
	
		do{
		
			System.out.println("Enter a number");
			userNum = userInput.nextDouble();
		
			userNumRt =	Math.sqrt(userNum);
			
			if(userNum < 0){
				System.out.println("Please enter a valid number.");
			}
		
		}while(userNum < 0);
		
		System.out.println("Answer: " + userNumRt);
		userInput.close();
	}
}
