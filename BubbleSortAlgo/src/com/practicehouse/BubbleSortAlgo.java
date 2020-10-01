package com.practicehouse;

import java.util.Scanner;

public class BubbleSortAlgo {

	public static void main(String[] args) {

		int numLength, swap;
		Scanner in = new Scanner(System.in);

		System.out.println("How Many Numbers you want to sort ?");
		numLength = in.nextInt();

		int array[] = new int[numLength];

		System.out.println("You have to enter " + numLength + " integers");

		for (int i = 0; i < numLength; i++) {
			array[i] = in.nextInt();
		}

		for (int j = 0; j < (numLength - 1); j++) {
			for (int k = 0; k < numLength - j - 1; k++) {
				// For Descending Order please use <
				if (array[k] > array[k + 1]) {
					swap = array[k];
					array[k] = array[k + 1];
					array[k + 1] = swap;
				}
			}
		}

		System.out.println("Sorted list of numbers");

		for (int i = 0; i < numLength; i++) {
			System.out.println(array[i]);
		}

	}
}
