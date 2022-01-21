package org.ymca.week2;

public class Util {
	// define a method that receive an array of numbers
	public int getSumOfNumbers(int numbers[]) {
		// at the beginning, declare sum = 0
		int sum = 0;

		// visit to each index of the array and get value and add it to sum
		for (int index = 0; index < numbers.length; index++) {
			sum = sum + numbers[index];
		}

		// return sum of the array after all numbers are sum up
		return sum;
	}

	// starting point to run Java program
	public static void main(String args[]) {
		// a new util instance is created
		Util util = new Util();

		// initialize an array and assign list numbers to array
		int numbers[] = { 1, 2, 5, 7, 9 };

		// get sum by using method getSumOfNumbers from util
		int sum = util.getSumOfNumbers(numbers);
		System.out.println("Sum of numbers are: " + sum);
	}
}
