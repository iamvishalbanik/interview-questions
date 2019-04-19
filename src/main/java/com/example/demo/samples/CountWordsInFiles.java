package com.example.demo.samples;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author vbanik
 * 
 * Program to read two files and count the number of words which are common in both the files.
 * Input-
 * file1- word of the day
 * file2- thought of the week
 * Output- 2
 *
 */
public class CountWordsInFiles {

	public static void main(String[] args) throws IOException {

		BufferedReader reader1=new BufferedReader(new FileReader("C:\\Users\\vbanik\\Desktop\\file1.txt"));
		BufferedReader reader2=new BufferedReader(new FileReader("C:\\Users\\vbanik\\Desktop\\file2.txt"));
		String s1,s2;
		int count=0;
		s1=reader1.readLine();			
		s2=reader2.readLine();
		String[] words1=s1.split(" ");
		String[] words2=s2.split(" ");
		for(int i=0;i<words1.length;i++) {
			for(int j=i;j<words2.length;j++) {
				if(words1[i].equals(words2[j])) {
					count++;
				}
			}
		}
		System.out.println(count);
		reader1.close();
		reader2.close();

	}
}
