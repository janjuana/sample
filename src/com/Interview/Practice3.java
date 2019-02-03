package com.Interview;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice3 {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ArrayList jam = new ArrayList();
	jam.add("go");
	jam.add("yo");
	jam.add("do");
	jam.add(5);
	
	System.out.println(jam);
	
	//Arrays.tolist
	//Valueof
	//char
	for (int i = 0; i < jam.size(); i++) {
		
		Object obj = jam.get(i);
		if (obj.equals(5))
		System.out.println(jam.indexOf(obj));
		}
	
	Object[] array1 = jam.toArray();
	System.out.println(array1);
	System.out.println(array1.length);
	
	String x = "hello man what is up";
	int d = 1234435;
	String integerD = String.valueOf(d);
	char[] findD = integerD.toCharArray();
	
	for(int l = 0; l<=findD.length-1;l++)
	{
	System.out.println(findD[l]);	
	}
	
	
	char[] findX = x.toCharArray();

	for(int y = findX.length-1; y >= 0; y--) {
		System.out.println(findX[y]);
		
	}
	
	Object[] jones = {3,35,64,64,3,8};
	Arrays.sort(jones);
	System.out.println(jones[jones.length-1]);
	
	String water = "whattttt ooooooooo";
	String reverse = "";
	
	for(int z = water.length()-1; z>= 0; z--) {
		reverse = reverse + water.charAt(z);
	}
	System.out.println(reverse);
	}
}

