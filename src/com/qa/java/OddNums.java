package com.qa.java;

public class OddNums {

	public static void main(String[] args) {
		// Tprint all odd nums in 1-1000
		int num = 0;
		
		while(num<=1000) {
			
			if (num %2 != 0) {
				System.out.println(num);
			}
			num++;
		}

	}

}
