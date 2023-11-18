
public class Assignment1 {

	public static void main(String[] args) {
		/*
		for(int a = 1; a <= 10; a++) {
			System.out.println(a);
		}
		System.out.println("=============");
		
		//EVEN
		System.out.println("EVEN");
		for(int b = 1; b <= 10; b++) {
			if(b % 2 == 0) {
				System.out.println(b);
			}
		}
		System.out.println("=============");
		
		//ODD
		System.out.println("ODD");
		for(int c = 1; c <= 10; c++) {
			if(c % 2 != 0) {
				System.out.println(c);
			}
		}
		System.out.println("=============");
		*/
		//NESTED FOR LOOP
		System.out.println("NESTED FOR LOOP");
		for(int d = 1; d <= 5; d++) {
			System.out.println(d);
			for(int e = 1; e <= 3; e++) {
				System.out.print(e + " ");
			}
			System.out.println();
		}
		System.out.println("=============");

	}

}
