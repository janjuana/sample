package com.Interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

public class Java {

	public static void main(String[] args) {
		/*String a = "Welcome home boy";
		int b = a.length();
		System.out.println(b);
		
		System.out.println(a.substring(3));
		
		String [] words = a.split(" ");
		System.out.println(words.length);
		
		for (String string: words) {
			System.out.println(string);
		}
		
		String h = "what is up";
		
		StringBuffer obj = new StringBuffer(h);
		System.out.println(obj.reverse());	
	
	int[] numArray = {31,43,564,21,55,2,44,86};
	Arrays.sort(numArray);
	System.out.println(numArray[numArray.length-2]
			);
	}
	*/
	
	ArrayList<String> obj1 = new ArrayList<String>();
	{
		obj1.add("Hi");
		obj1.add("Hi");
		obj1.add("yo");
	}
	
	HashSet<String> obj2 = new HashSet<String>(obj1);
	
	obj2.addAll(obj1);
	System.out.println(obj2);
	
	System.out.println(String.valueOf(obj2));
	
	
	Integer[] array = {0,421,43,3,2,423,5};
	int min = Collections.min(Arrays.asList(array));
	int max = Collections.max(Arrays.asList(array));
	System.out.println(min);
	System.out.println(max);
	
	String[] obj3 = {"geagvj","htahat","hhthy","kujuyb"};
	ArrayList<String> obj4 = new ArrayList<String>();
	
	String alphacar = Collections.max(Arrays.asList(obj3));
	
	System.out.println(alphacar);
	
	
	String x = "Hello everyone";
	String y = "Welcome";
	

	
	String [] words = x.split(" ");
	System.out.println(words.length);
	
	for (String string: words) {
		System.out.println(string);
	}
	
	int apple = words.length;
	System.out.println(x);
	x = x+y;
	y = x.substring((0),(x).length()-(y).length());
	x = x.substring(y.length());
	//System.out.println(x);
	//System.out.println(y);
	
	
	String dog = "hello everyone welcome to the class";
	
	char[] oop = dog.toCharArray();
	
	int ban = oop.length;
	System.out.println(ban);
	
	String [] words2 = dog.split(" ");
	System.out.println(words2.length);
	
	for (String string3 : words2) {
		System.out.println(string3);
	}
	
	
	String oi = "42342";
	String numbers2 = String.valueOf(oi);
	System.out.println(oi);
	
	String reverse = "";
	
	for(int i = oi.length()-1;i>=0;i--)
	{
		reverse = reverse + oi.charAt(i);
	}
	System.out.println(reverse);
}
}
