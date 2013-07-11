package com.example.main;

public class ChildThread extends Thread{

	ChildThread() {
		// Create a new, second thread

	    start(); // Start the thread
	}

	// This is the entry point for the second thread.
	public void run() {
		try {
			// Starts counting odd numbers
			for(int i = 1; i < 10; i=i+2) {
				System.out.println("Child Thread: " + i);
				// Let the thread sleep for a while.
	            Thread.sleep(501);
	         }
	      } catch (InterruptedException e) {
	         System.out.println("Child interrupted.");
	      }
	      System.out.println("Child thread exiting.");
	}
}

	
