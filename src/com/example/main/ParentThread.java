package com.example.main;

public class ParentThread {
	   public static void main(String args[]) {
	      new ChildThread(); // create a new thread
	      try {
	    	 System.out.println("Let's Start Counting Kiddo");
	    	 //Starts counting even numbers
	         for(int i = 0; i < 11; i=i+2) {
	            System.out.println("Parent Thread: " + i);
	            Thread.sleep(500);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Parent thread interrupted.");
	      }
	      System.out.println("Parent thread exiting.");
	   }
	
}