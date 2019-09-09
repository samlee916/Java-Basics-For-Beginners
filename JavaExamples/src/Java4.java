//A Java example about arrays
import java.util.ArrayList;

public class Java4 {

	public static void main(String[] args) {
		
		int[] var = {1,2,3};
		System.out.println(var[2]);
		int[] array = new int[10];
		for(int i = 0; i < 10; i++) {
			array[i] = i;
		}
		System.out.println(array[5]);
		
		String[] array1 = new String[5];
		array1[4] = "Hello";
		System.out.println(array1[4]);
		
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Hi");
		arraylist.add("Hello");
		arraylist.add("Hey");
		//adds these strings to the arraylist
		System.out.println(arraylist);
		
		ArrayList<Integer> arraylist1 = new ArrayList<Integer>();
		for(int i = 1; i <= 1000; i++) {
			if(i%5 == 0) {
				arraylist1.add(i);
			}
		}
		System.out.println(arraylist1.size());
		int[] array2 = new int[200];
		for(int i = 1; i <= 1000; i++) {
			if(i%5 == 0) {
				array2[i/5-1] = i;
			}
	}
		for(int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		}

}
