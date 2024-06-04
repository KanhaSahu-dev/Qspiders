package com.org;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Expt {
public static void main(String[] args) {
	try {
		FileReader file = new FileReader("D:\\QSPIDERS\\WEB_TECH_PRACITCE\\practice1.html");
		BufferedReader br = new BufferedReader(file);
		String line;
		while((line=br.readLine())!=null ) {
			System.out.println(line);
		}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
