
public class ControlStatements {

	public static void main(String[] args) {
		
		//Start of Simple if Statement
		System.out.println("Start");
		int a = 10;
		if(a == 10) {
			System.out.println("Condition Satisfied");
		}
		System.out.println("End");
		//End of Simple if Statement
		System.out.println();
		
		//Start of Simple if else Statement
		System.out.println("Start");
		int b = 20;
		String name1 = "Abinash";
		if(b <= 20 && name1 == "Abinash") {
			System.out.println("Condition Satisfied");
		}else {
			System.out.println("Condition Unsatisfied");
		}
		System.out.println("End");
		//End of Simple if else Statement
		System.out.println();
		
		//Start of Nested if Statement
		System.out.println("Start");
		int c = 20;
		int d = 40;
		if(c < d) {
			System.out.println("If Statement");
			if(d>20) {
				System.out.println("Inner if Statement");
			}
		}
		System.out.println("End");
		//End of Nested if Statement
		System.out.println();
		
		//Start of If else if Statement
		System.out.println("1. With Draw Operation");
		System.out.println("2. Quick Transfer");
		System.out.println("3. Mini Statement");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. Change Password");
		
		int userChoice = 5;
		
		if(userChoice == 1){
			System.out.println("With Draw Operation");
		}else if(userChoice  == 2){
			System.out.println("Quick Transfer Operation");
		}else if(userChoice  == 3){
			System.out.println("Mini Statement Operation");
		}else if(userChoice  == 4){
			System.out.println("Balance Enquiry Operation");
		}else if(userChoice  == 5){
			System.out.println("Change Password Operation");
		}else{
		    System.out.println("Invalid Option!!!!");
		}
		System.out.println("End");
		//End of If else if Statement
		System.out.println();
		
		//Start of Switch Statement
		System.out.println("1. With Draw Operation");
		System.out.println("2. Quick Transfer");
		System.out.println("3. Mini Statement");
		System.out.println("4. Balance Enquiry");
		System.out.println("5. Change Password");
		
		int choice = 2;
		switch(choice) {
			case 1: System.out.println("With Draw Operation");
					break;
			case 2: System.out.println("Quick Transfer Operation");
					break;
			case 3: System.out.println("Mini Statement Operation");
					break;
			case 4: System.out.println("Balance Enquiry Operation");
					break;
			case 5: System.out.println("Change Password Operation");
					break;
			default: System.out.println("Choice Not Matched Given Options");
	  		   		break;
		}
		//End of Switch Statement
		System.out.println();
		
	}

}
