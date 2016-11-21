import java.util.Scanner;
/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #4, Program 1
 *November 8th, 2016
 * 
 */
public class Lab4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner userInput = new Scanner(System.in);
		
		double userWeight;
		double userSpaceWeight;
		String celestialBody;
		
		System.out.print("PLease enter your current weight: ");
		userWeight = userInput.nextDouble();
		
		System.out.println("Please pick a celestial body ");
		celestialBody = userInput.next();
		
		if(celestialBody.equalsIgnoreCase("Mercury")){
			
			userSpaceWeight = userWeight * 0.38;
			
			System.out.println("Your weight on Mercury is " + userSpaceWeight + " lbs. ");
			
		}
		
		if(celestialBody.equalsIgnoreCase("Venus")){
			
			userSpaceWeight = userWeight * 0.91;
			
			System.out.println("Your weight on Venus is " + userSpaceWeight + " lbs. ");
			
		}
		
		if(celestialBody.equalsIgnoreCase("Earth")){
			
			userSpaceWeight = userWeight * 1;
			
			System.out.println("Your weight is the same as before nurd. Here it is bum face; " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Moon")){
			
			userSpaceWeight = userWeight * 0.165;
			
			System.out.println("Your weight on the Moon is " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Mars")){
			
			userSpaceWeight = userWeight * 0.38;
			
			System.out.println("Your weight on Mars is " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Jupiter")){
			
			userSpaceWeight = userWeight * 2.34;
			
			System.out.println("Your weight on Jupiter is " + userSpaceWeight + " lbs. ");
			
		}
		
		if(celestialBody.equalsIgnoreCase("Saturn")){
			
			userSpaceWeight = userWeight * 1.06;
			
			System.out.println("Your weight on Saturn is " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Uranus")){
			
			userSpaceWeight = userWeight * 0.92;
			
			System.out.println("Your weight on Uranus is " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Neptune")){
			
			userSpaceWeight = userWeight * 1.19;
			
			System.out.println("Your weight on Neptune is " + userSpaceWeight + " lbs. ");
			
		}
	
		if(celestialBody.equalsIgnoreCase("Pluto")){
			
			userSpaceWeight = userWeight * 0.06;
			
			System.out.println("Your weight on Pluto is " + userSpaceWeight + " lbs. ");
			
		}
		userInput.close();
	}
}
