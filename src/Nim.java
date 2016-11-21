import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #4, Program Bonus
 *November 18th, 2016
 * 
 */
public class Nim {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner(System.in);
		
		String playerName1;
		String playerName2;
		String pileSelect;
		
		int pileA = 3; 
		int pileB = 4;
		int pileC = 5;
		int playerNum1;
		int playerNum2;
		
		boolean turn;
		
		System.out.print("Player 1, Enter your name: ");
		playerName1 = userInput.next();
		
		System.out.print("Player 2, Enter your name: ");
		playerName2 = userInput.next();
		
		while((pileA > 0) || (pileB > 0) || (pileC > 0) ){
			turn = true;
			System.out.println("\nA: " + pileA + " B: " + pileB + " C: " + pileC);
			System.out.print("\n" + playerName1 + ", choose a pile: ");
			pileSelect = userInput.next();
			
			if(pileSelect.equalsIgnoreCase("A")){
				
				if(pileA <= 0){
					
					while(pileSelect.equalsIgnoreCase("A")){
						
						System.out.println("Please choose another pile");
						pileSelect = userInput.next();
					}
					
					if(pileSelect.equalsIgnoreCase("B")){
						pileSelect = "B";
					}
					if(pileSelect.equalsIgnoreCase("C")){
						pileSelect = "C";
					}
					
				} else {
					pileSelect = "A";
				}
			
			}
			
			if(pileSelect.equalsIgnoreCase("B")){
				
				if(pileB <= 0){
					
					while(pileSelect.equalsIgnoreCase("B")){
						
						System.out.println("Please choose another pile");
						pileSelect = userInput.next();
					}
					
					if(pileSelect.equalsIgnoreCase("A")){
						pileSelect = "A";
					}
					if(pileSelect.equalsIgnoreCase("C")){
						pileSelect = "C";
					}
					
				} else {
					pileSelect = "B";
				}
			}
			if(pileSelect.equalsIgnoreCase("C")){
				if(pileC <= 0){
					
					while(pileSelect.equalsIgnoreCase("C")){
						
						System.out.println("Please choose another pile");
						pileSelect = userInput.next();
						
					}
					
					if(pileSelect.equalsIgnoreCase("A")){
						pileSelect = "A";
					}
					if(pileSelect.equalsIgnoreCase("B")){
						pileSelect = "B";
					}
					
				} else {
					pileSelect = "C";
				}
			}
			
			System.out.print( playerName1 + ", Choose how many to remove from pile " + pileSelect + ": ");
			playerNum1 = userInput.nextInt();
			
			if(pileSelect == "A"){
				
				while(pileA - playerNum1 < 0){
					System.out.println("Enter another number: ");
					playerNum1 = userInput.nextInt();
				}
				pileA = pileA - playerNum1;
			}
			else if(pileSelect == "B"){
				pileB = pileB - playerNum1;
			}
			else if(pileSelect == "C"){
				pileC = pileC - playerNum1;
			}
			
			if(pileA > 0 || pileB > 0 || pileC > 0){
				turn = false;
				System.out.println("\nA: " + pileA + " B: " + pileB + " C: " + pileC);
				System.out.print("\n" + playerName2 + ", choose a pile: ");
				pileSelect = userInput.next();
			
				if(pileSelect.equalsIgnoreCase("A")){
				
					if(pileA <= 0){
					
						while(pileSelect.equalsIgnoreCase("A")){
						
							System.out.println("Please choose another pile");
							pileSelect = userInput.next();
						}
					
						if(pileSelect.equalsIgnoreCase("B")){
							pileSelect = "B";
						}
						if(pileSelect.equalsIgnoreCase("C")){
							pileSelect = "C";
						}
						
					} else {
						pileSelect = "A";
					}
					
				}
				
				if(pileSelect.equalsIgnoreCase("B")){
					
					if(pileB <= 0){
						
						while(pileSelect.equalsIgnoreCase("B")){
							
							System.out.println("Please choose another pile");
							pileSelect = userInput.next();
						}
						
						if(pileSelect.equalsIgnoreCase("A")){
							pileSelect = "A";
						}
						if(pileSelect.equalsIgnoreCase("C")){
							pileSelect = "C";
						}
						
					} else {
						pileSelect = "B";
					}
				}
				if(pileSelect.equalsIgnoreCase("C")){
					if(pileC <= 0){
						
						while(pileSelect.equalsIgnoreCase("C")){
							
							System.out.println("Please choose another pile");
							pileSelect = userInput.next();
							
						}
						
						if(pileSelect.equalsIgnoreCase("A")){
							pileSelect = "A";
						}
						if(pileSelect.equalsIgnoreCase("B")){
							pileSelect = "B";
						}
						
					} else {
						pileSelect = "C";
					}
				}
				
				System.out.print( playerName2 + ", Choose how many to remove from pile " + pileSelect + ": ");
				playerNum2 = userInput.nextInt();
				
				if(pileSelect == "A"){
					
					while(pileA - playerNum2 < 0){
						System.out.println("Enter another number: ");
						playerNum1 = userInput.nextInt();
					}
					pileA = pileA - playerNum2;
				}
				else if(pileSelect == "B"){
					pileB = pileB - playerNum2;
				}
				else if(pileSelect == "C"){
					pileC = pileC - playerNum2;
				}
				
				
				
			}
		}
		
		if(turn = true){
			System.out.println("Game Over. " + playerName1 + " Wins.");
		}
		else{
			System.out.println("Game Over. " + playerName2 + " Wins.");
		}
		userInput.close();
		
	}
}