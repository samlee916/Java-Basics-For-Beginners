//A Java example about conditions and loops
public class Java3 {

	public static void main(String[] args) {
		int age = 19;
		//prints the else statement
		if(age < 18) {
			System.out.println("You are a minor.");		
		}
		else if(age < 40) {
			System.out.println("You are under 40.");		
		}
		else {
			System.out.println("You are an adult.");		
		}
		//prints out 1-100
		for (int i = 0; i <+ 100; i++) {
			System.out.println(i);
		}
		//prints true 9 times
		int o = 0;
		while(o < 10) {
			System.out.println("true");
			o++;
		}
		
	}
}
