/* 
 * 
 * 
 * Problem Statement
 * ArmStrong Number in Java 
 * A number that is equal to sum of its cubes
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)  
 * 371 = (3*3*3)+(7*7*7)+(1*1*1)  
*/

package org.general;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		int r,sum=0, temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check for armstrong");
		int num = sc.nextInt();
		temp = num;
		
		while(temp>0) {
			 r = temp%10;
			 temp = temp/10;
			 sum = sum + (r*r*r);
		}
		
		if(num == sum) {
			System.out.println("The number is Armstrong");
		}
		else {
			System.out.println("The number is not Armstrong, sum of its cube is: "+ sum);
		}
	}

}
