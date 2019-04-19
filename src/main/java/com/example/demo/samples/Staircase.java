package com.example.demo.samples;

/**
 * @author vbanik
 * 
 * Program to print staircase pattern given a integer n.
 * Input- 10
 * Output-
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10
 *
 */
public class Staircase {

	static void staircase(int n) {
		int k = 1;
		int count=1;
		while (n != 0) {
			for (int j = 0; j < k; j++) {
				System.out.print(count+++" ");
			}
			k++;
			System.out.println();
			n--;
			if(count>n) break;
		}
	}
	public static void main(String[] args) {

		staircase(10);
	}

}
