package com.example.demo.samples;

/**
 * @author vbanik
 * 
 * Program to reverse a string with words.
 * Input- Hi this is a sentence
 * Output- sentence a is this Hi
 *
 */
public class ReverseStringWithWords {

	public static void main(String[] args) {
		
		String s3="My name is unknown";
		String[] words3=s3.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=words3.length-1;i>=0;i--) {
			sb.append(words3[i]+" ");
		}
		System.out.println(sb.toString().trim());
		
	}
}
