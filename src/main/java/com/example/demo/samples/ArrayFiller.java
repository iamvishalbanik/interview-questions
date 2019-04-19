package com.example.demo.samples;

import java.io.IOException;

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
	System.out.println();
}

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
public static void main(String[] args) throws IOException {
	
	fill(6);
	staircase(10);
}
}
