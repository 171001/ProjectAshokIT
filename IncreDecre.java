
public class IncreDecre {

	public static void main(String[] args) {
		
		int a = 10;
		System.out.println("Before === " + a);
		System.out.println("Pre Increment === " + (++a));
		System.out.println("After === " + a);
		System.out.println("Post Increment === " + (a++));
		System.out.println("After === " + a);
		
		System.out.println("========== ");
		
		System.out.println("Current === " + a);
		System.out.println("Pre Decrement === " + (--a));
		System.out.println("After === " + a);
		System.out.println("Post Decrement === " + (a--));
		System.out.println("After === " + a);
	}

}
