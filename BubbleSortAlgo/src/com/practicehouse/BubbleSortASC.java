package com.practicehouse;

public class BubbleSortASC {

	public static void main(String[] args) {

		int[] numbers = { 4, 7, 8, 2, 1 };

		System.out.println("Given Array include Numbers :");
		for (int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k] + " ");
		}

		// just to make a new line
		System.out.println();

		int tempNum;

		for (int i = 0; i < (numbers.length - 1); i++) {
			for (int j = 0; j < numbers.length - i - 1; j++) {
				if (numbers[j] > numbers[j + 1]) {
					tempNum = numbers[j];
					numbers[j] = numbers[j + 1];
					numbers[j + 1] = tempNum;
				}
			}
		}

		System.out.println("Sorted list of numbers");

		for (int k = 0; k < numbers.length; k++) {
			System.out.print(numbers[k] + " ");
		}

	}
}
