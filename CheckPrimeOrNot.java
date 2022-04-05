package com.sebone.excr.numeric;
import java.util.Scanner;

    /*class Name :- CheckPrimeOrNot
      * Objective :- This class check the given number is prime or not
      * @Author :- Bhawna Rathor
      * @Date :-17/03/2022
      */ 
 public class CheckPrimeOrNot {
	
	     /* Method Name :-checkPrime
	      * Objective :- This Method check the given number is prime or not
          * @Param :-this method takes 1 parameter Value of n;
          * @return  :- boolean;
	      */
          public boolean isPrime(int n) {
        	  if (n <= 1) {
                  return false;
        	  }    
        	  
              // check from 2 to n/2
              for (int i = 2; i <=n/2; i++) {
                  if (n % i == 0) {
                      return false;
                  } 
              }    
              return true;         
           }//checkPrime method close
          

 	      /* Method Name :-main method
 	       * Objective :- This Method is the driver method 
           * Input Parameter :-this method takes string array parameter
           * return Type :- void;
 	      */
	      public static void main(String[] args) {
	     	// TODO Auto-generated method stub
		    Scanner sc=new Scanner(System.in);
		    CheckPrimeOrNot checkPrimeOrNot =new CheckPrimeOrNot(); 
	        System.out.println("Enter value of N = ");
	        int n=sc.nextInt();
	        boolean check= checkPrimeOrNot.isPrime(n);
	        if(check) {
	    	    System.out.println("given number is prime ");
	        }
	        else {
	    	    System.out.println("given number is not prime ");
	        }
	        sc.close();
        	}//main method close

  }//class close
