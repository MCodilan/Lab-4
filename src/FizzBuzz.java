/**
 * 
 *Name: Mihailo Codilan
 *Teacher: Mr.Hardman
 *Assignment #4, Program 3
 *November 16th, 2016
 * 
 */
public class FizzBuzz {                      
	
	public static void main(String[] args) {  
    
		for(int i = 1; i <= 100; i++) {                    
      
			if((i % 3) == 0 && (i % 5) == 0){
				System.out.print("FizzBuzz");
			} else if ((i % 3) == 0){
				System.out.print("Fizz");
			}
			else if ((i % 5) == 0){
				System.out.print("Buzz"); 
			}
			else{ 
				System.out.print(i);                       
			}
		
			System.out.println(" "); 
    
		}
 
	}

}
