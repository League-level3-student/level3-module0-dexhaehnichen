package _03_More_Array_Fun;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MoreArrayFun {
	//1. Create a main method to test the other methods you write.
	public static void main(String[] args) {
		String[] testStringArray = {"apple","banana","carrot","pineapple","radish"};
		printStringArray(testStringArray);
		System.out.println("");
		printReversedStringArray(testStringArray);
		System.out.println("");
		printEveryOtherString(testStringArray);
		System.out.println("");
		printStringsRandomly(testStringArray);
	}
	//2. Write a method that takes an array of Strings and prints all the Strings in the array.
	static void printStringArray(String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			System.out.println(stringArray[i]);	
		}
	}
	
	
	 //3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void printReversedStringArray(String[] stringArray) {
		for (int i = stringArray.length-1; i >= 0; i--) {
			System.out.println(stringArray[i]);
		}
	}
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void printEveryOtherString (String[] stringArray) {
		for (int i = 0; i < stringArray.length; i++) {
			if(i%2 == 1) {
				System.out.println(stringArray[i]);
			}
		}
	}
	
	//5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	static void printStringsRandomly (String[] stringArray) {
		Random r = new Random();
		ArrayList<String> words = new ArrayList <String>(Arrays.asList(stringArray));
		while(words.size()>0) {
			int index = r.nextInt(words.size());
			System.out.println(words.get(index));
			words.remove(index);
		}
		
	}
	
}
