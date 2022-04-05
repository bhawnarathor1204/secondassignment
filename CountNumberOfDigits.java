package com.sebone.excr.numeric;
//package name should be small letter, ideally should not be more than 6 letters
//mostly group of classes, not class name
//com.sebone.excer.numeric;
//Project name should in class name format
import java.util.Scanner;

/* class Name :- CountNumberOfDigits 
 * Objective :- This class count the number of digits present in given number.
 * Author :- Bhawna Rathor
 * Date :-17/03/2022
 */
public class CountNumberOfDigits {
   
	/* Method Name:-countDigit
	 * Objective :- This Method count the number of digits in given number
     * @input Parameter :-this method takes 1 parameter Value of n;
     * @return:-int ;
     * this method is public and non static
	 */
	public int countDigit(int n) {
		int num=n;
		int count=0;
		while(num>0){		
	      num=num/10;
	      count++;
		}
		
		return count;
	}

	   /* Method Name :-main method
        * Objective :- This Method is the driver method 
        * Input Parameter :-this method takes string array parameter
        * return Type :- void;
        */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		CountNumberOfDigits countNumberOfDigits=new CountNumberOfDigits(); 
	    System.out.println("Enter value of N = ");
	    int n=sc.nextInt();
	    int answer=countNumberOfDigits.countDigit(n);
	    System.out.println(answer);
	    sc.close();
	}

}
