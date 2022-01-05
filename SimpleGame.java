package simplegame;
import java.util.Scanner;

/**
 * In this assignment, you will implement a simple game.  This game has 2 options for the user playing.  Based on user input, the 
 * user can choose to either convert time, from seconds to hours, minutes, and seconds, or calculate the sum of all digits in an integer.  
 * 
 * At the beginning of the game, the user will be prompted to input either 1 or 2, to indicate which option of the game they want 
 * to play.  1 will indicate converting time, and 2 will indicate calculating the sum of digits in an integer.
 * 
 * For converting time, the user will be prompted to input a number of seconds (as an int) and the program will call a method that 
 * will convert the seconds to time, in the format hours:minutes:seconds, and print the result.  For example, if the user enters 6734, 
 * the program will print the time, 1:52:14. As another example, if the user enters 10,000, the program should print 2:46:39.
 * 
 * For calculating the sum of digits in an integer, the user will be prompted to input a number (as a non-negative int) and the program will 
 * call a method to calculate the sum of the digits in that number, and print the result.  For example, if the user enters 321, 
 * the program will print the sum, 6, because the individual digits in the number add up to 6.  3 + 2 + 1 = 6.
 * 
 * Each method has been defined for you, but without the code. See the javadoc for each method for instructions on what the method 
 * is supposed to do and how to write the code. It should be clear enough.  In some cases, we have provided hints to help you get started.
 * 
*/
public class SimpleGame {
	





	/**
	 * Write a method to convert the given seconds to hours:minutes:seconds.
	 * @return string for the converted seconds in the format: 23:59:59
	 * 
	 * Example(s): 
	 * - If input seconds is 1432, print and return output in the format: 0:23:52
	 * - If input seconds is 0, print and return output in the format: 0:0:0
	 * - If input seconds is not valid (negative), print and return: -1:-1:-1.  
	 *   So if input seconds is -2, print and return: -1:-1:-1 
	 *   If input seconds is -3214, likewise print and return: -1:-1:-1
	 */
	public static String convertTime(int seconds) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input number of seconds");
		int number = sc.nextInt();
		
		int h = (number/60)/60;
		int m = (number / 60) % 60;
		int s = number % 60;
		System.out.println(h + ":" + m + ":" + s );
	
	    
		return null;
	
		
	}

	/**
	 * Write a method that adds all the digits in the given non-negative integer.
	 * @param integer to add digits
	 * @return integer in which all the digits in the given non-negative integer are added.
	 * 
	 * Example(s): 
	 * - If input is 565, print and return 16.
	 * - If input is 7, print and return 7.
	 * - If input is 0, print and return 0.
	 */
	public static int digitsSum(int input){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a number");
		int number = sc.nextInt();
		
		 
		//finds the last digit of the given number   
		
		int sum = 1;	
		for(sum= 0; number!=0; number=number/10)  
			{     
			sum = sum + number % 10; 	
			}
			
			System.out.println(sum);
			return number;  
			
			
		
			
				
		}



	
	public static void main(String[] args) {
		// Create an instance of the SimpleGame class.
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Input 1 or 2 to begin");
		int num = sc.nextInt();
		
		
		if(num == 1) {
			
		convertTime(num);
		
		}
		
		else 
		{
			
			digitsSum(num);
			
		}
		
		sc.close();
		
		
	}
		
	}	

