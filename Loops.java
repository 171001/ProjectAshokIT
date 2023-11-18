
public class Loops {

	public static void main(String[] args) {
		/*
		//WHILE LOOP
		int a = 1;
		while(a <= 50) {
			if(a % 2 == 0) {
				System.out.println("Even Number == " + a);	
			}
			a++;
		}
		
		//TABLE OF 5
		int b = 1;
		int table1 = 5;
		while(b <= 10) {
			System.out.println(table1 + " * " + b + " = " + (table1 * b));
			b++;
		}
		
		//DO WHILE LOOP
		int c = 1;
		int table2 = 6;
		do {
			System.out.println(table2 + " * " + c + " = " + (table2 * c));
			c++;
		}while(c <= 10);
		
		//FOR LOOP
		int table3 = 7;
		for(int i = 1; i <= 10; i++) {
			System.out.println(table3 + " * " + i + " = " + (table3 * i));
		}
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("Hello");
			for(int j = 1; j <= 3; j++) {
				System.out.println("World");
			}
		}
		*/
		//NUMBER PATTERN
		for(int i = 1; i <= 5 ; i++){
			for(int j = 1; j<=i ; j++){
			   System.out.print(j+" ");		   
			}
			System.out.println();
		}
		
		
	}
}
