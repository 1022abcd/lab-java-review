package edu.info448.review;

import java.util.*;

/**
 * A basic class for running and testing the Dog class
 */
public class Tester {

	public static void main(String[] args){
		Dog dog = new Dog();
		dog.bark();
		dog.walk();
		Husky husky = new Husky();
		husky.bark();
		Dog[] pups = Dog.createPuppies(3);
		System.out.println(Arrays.toString(pups));


	}
}