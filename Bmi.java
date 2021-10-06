package bodymassindex;
import java.util.*;

public class Bmi {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("Enter next person's information: ");
		System.out.println("height " + "in inches?");                                                                     
		double height = console.nextDouble();
		System.out.println("weight " + "in pounds?");
		double weight = console.nextDouble();
		double BMI = weight/(height*height)*703;
		System.out.println("Person 1 BMI = " + BMI);
		
		if (BMI< 18.5) {
			System.out.println("underweight");
		} else if (BMI < 24.9) {
			System.out.println("normal");
		} else if (BMI < 29.9) {
			System.out.println("overweight");
		} else {
			System.out.println("obese");
		}
			
    }
			
}
		
		
		
		
		
		


	
