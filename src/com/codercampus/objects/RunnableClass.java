package com.codercampus.objects;

public class RunnableClass {

	public static void main(String[] args) {
		// Class -> Blueprint for an Object
		// Object -> Noun, it's an  instantiation of a Class
		
		Human mikeLansing = new Human();
		mikeLansing.eyeColor = "Hazel";
		mikeLansing.gender = "Male";
		mikeLansing.height = "6'3\"";
		mikeLansing.weight = "275";
		
		System.out.println(mikeLansing);
		
		Human elonMusk = new Human();
		elonMusk.eyeColor = "Blue";
		elonMusk.gender = "Male";
		elonMusk.height = "6'1\"";
		elonMusk.weight = "190";
		
		System.out.println(elonMusk);
	}
}
