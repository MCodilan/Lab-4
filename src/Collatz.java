import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #4, Program Bonus
 *November 14th, 2016
 * 
 */
public class Collatz {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		int userNum;
		
		System.out.println("Please enter a number");
		userNum = userInput.nextInt();
		
		do{
			if(userNum %2 == 0){
				userNum = userNum / 2;
			}
			else{
				userNum = userNum * 3 + 1;
			}
			System.out.println(userNum);
		}while(userNum != 1);
		userInput.close();
	}

}
