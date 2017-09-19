package myfirsttestproject;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequePractice {
	
	public static void main(String[] args) {
		Deque<String> myDeque = new ArrayDeque<>();
		
		myDeque.add("first");
		myDeque.add("second");
		myDeque.add("third");
		
		for (String string : myDeque) {
			System.out.println(string);
		}
		
		System.out.println(myDeque.element());
		
		for (String string : myDeque) {
			System.out.println(string);
		}
		
		myDeque.poll();
		
		for (String string : myDeque) {
			System.out.println(string);
		}	
		
	}

}
