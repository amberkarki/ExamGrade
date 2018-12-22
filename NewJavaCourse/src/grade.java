import java.util.Scanner;
public class grade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("            *** Exam grading ***\n");
				
		try {
		System.out.println("**Enter Your  Total Obtain Points From Each Course:** ");
		System.out.println("=====================================================");
		
		System.out.print("Enter exam points: ");
		double obtainNumber = Double.parseDouble(input.nextLine()); // Double.parseDouble using this method to  parse to double
		
		if (obtainNumber<0 || obtainNumber > 100) {// user input control  if  input value is < 0 or >100
			System.out.print("\nInvalid grade points! please valid score (0-100)");
			
		
		} else if (obtainNumber>=90) {
			System.out.println("\nYour grade is: A");
			
		} else if (obtainNumber>=80){
			System.out.println("\nYour grade is: B");
			
		} else if (obtainNumber>=70){
			System.out.println("\nYour grade is: C");
			
		} else if (obtainNumber>=60){
			System.out.println("\nYour grade is: D");	
		}
		
		else if(obtainNumber>=50)
		{
			System.out.print("\n The grade is Pass");
		}
		
				
		else {
			System.out.print("\n Better Luck Next Time !!");
		}
		
		} 
		catch (Exception e){
			System.out.print("\nInvalid grade points! please valid score (0-100)");
		}
	}

}
