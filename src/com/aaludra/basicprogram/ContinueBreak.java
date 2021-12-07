package com.aaludra.basicprogram;

public class ContinueBreak {

	public static void main(String[] args) {

   	 System.out.println("Continute");
		int i= 10;
		 for (i=0;i<20;i++) {
			 if (i==8) {
				i++;
				continue;}
			
			 System.out.println(i);
				
			 }

    	 System.out.println("");
    	 System.out.println("Break");
		     for (i=0;i<=8;i++) {
		    	 if(i==7) {
		    		 break;
		    	 }
		    	 System.out.println(i);
		     }
			 
			
		 } 
		 
		 }


