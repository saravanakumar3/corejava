package com.chainsys.introduction;

public class Fivejavalesson {
	public static void main(String[] args) {

printMatrix();
		printTriangleB();
	}

	public static void printnumberonetoten() {
		int count = 0;
		for (count = 0; count <= 10; count++) {
			System.out.println(count + " ");
		}
	}

	public static void printnumbertentoone() {
		int c = 0;
		for (c = 10; c >= 1; c--) {
			System.out.println(c + " ");
		}
	}

	// nested for loop
	public static void printMatrix() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(countB + " ");
			}
			System.out.println();
		}
	}

	public static void printTriangleB() {
		int countA = 0;
		for (countA = 1; countA <= 10; countA++) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print(". ");
			}
			for (int countc = countA; countc >= 1; countc--) {
				System.out.print(countc);
			}
			System.out.println();
		}
	}
	
}
