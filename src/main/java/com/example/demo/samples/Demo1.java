package com.example.demo.samples;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo1 {

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
		String s3="My name is unknown";
		String[] words3=s3.split(" ");
		StringBuilder sb=new StringBuilder();
		for(int i=words3.length-1;i>=0;i--) {
		sb.append(words3[i]+" ");
		}
		System.out.println(sb.toString().trim());
	}
}
