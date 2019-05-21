package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
String[] strings = new String[5]; 
strings[0] = "one";
strings[1] = "two";
strings[2] = "three";
strings[3] = "four";
strings[4] = "five";
		//2. print the third element in the array
System.out.println(strings[2]);
		//3. set the third element to a different value
strings[2] = "3";
		//4. print the third element again
		System.out.println(strings[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for(int i = 0; i < strings.length; i++) {
			strings[i] = "number";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
		//7. make an array of 50 integers
int[] integers = new int[50];
		//8. use a for loop to make every value of the integer array a random number
Random r = new Random(100);
for(int i = 0; i < integers.length; i ++) {
	integers[i] = r.nextInt();
}
		//9. without printing the entire array, print only the smallest number on the array
int SmallestInt = 0;
for(int i = 0; i < integers.length; i++) {
if(integers[i]<SmallestInt) {
SmallestInt = integers[i];
}
}
System.out.println("Smallest Int: " + SmallestInt);
		//10 print the entire array to see if step 8 was correct
for(int i = 0; i < integers.length; i++) {
	System.out.println(integers[i]);
}
		//11. print the largest number in the array.
		int LargestInt = 0;
for(int i = 0; i <integers.length; i++) {
	if(integers[i]>LargestInt) {
		LargestInt = integers[i];
	}
}
System.out.println("Largest Int: " + LargestInt);
		//12. print only the last element in the array
		System.out.println(integers[49]);
	}
}
