package _00_intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList (java.util) class
		ArrayList<String> names = new ArrayList<String>();
		//2. Add five Strings to your list
		names.add("Joe");
		names.add("Bob");
		names.add("Fred");
		names.add("Todd");
		names.add("Danny");
		//3. Print all the Strings using a standard for-loop
		for(int i = 0; i < names.size(); i++){
			String s = names.get(i);
			System.out.println("String at element " + i + " " + s);
		}
		for(String s : names){
			System.out.println(s);
		}
		
		//5. Print only the even numbered elements in the list.
		for(int i = 0; i < names.size(); i++) {
			if(i%2 == 0) {
				System.out.println(names.get(i));
			}
		}
		//6. Print all the Strings in reverse order.
		for(int i = 4; i >= 0; i--) {
			System.out.println(names.get(i));
		}
		if(names.contains("e")) {
			System.out.println("Joe,Fred");
		}
		else {
			
		}
	}
}
