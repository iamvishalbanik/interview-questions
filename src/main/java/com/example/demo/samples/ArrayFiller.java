package com.example.demo.samples;

/**
 * @author vbanik
 * 
 * Program to fill an array of size 5 in cyclic order with a given integer n
 * Input- 6
 * Output- 6 2 3 4 5
 *
 */
public class ArrayFiller {

	static int arr[]=new int[5];

	static void fill(int n) {
		int temp=1;
		outer:while(true) {
			for(int i=0;i<arr.length;i++) {
				arr[i]=temp;
				if(temp==n) {
					break outer;
				}
				temp++;
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

	public static void main(String[] args) {

		fill(6);
	}
}
