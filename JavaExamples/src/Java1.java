
public class Java1 {

	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("hello");
		System.out.println("hey");
		//calling the methods
		one();
		two();
		one();

	}
	public static void one() {
		System.out.println("one");
		two();
		System.out.println("two");

	}
	public static void two() {
		System.out.println("method 2");
	}

}
