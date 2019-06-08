package com.example.demo.samples;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author vbanik
 * 
 * Program to find odd numbers using lambda.
 * Input- 1 2 3 4 5
 * Output- 1 3 5
 *
 */
public class FindOddNosUsingLambda {

	
	public static void main(String[] args) {
		
		List<Integer> myList=new ArrayList<>();
		int arr[]= {6,3,9,8,2,4,1};
		for(int i=0;i<arr.length;i++) {
			myList.add(arr[i]);
		}
		List<Integer> newList=myList.stream().filter( j->{
		return j%2!=0;
		}
		).collect(Collectors.toList());
		System.out.println(newList.toString());
		
	}
}
