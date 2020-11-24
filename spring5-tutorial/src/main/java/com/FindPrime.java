package com;

public class FindPrime extends Thread implements Runnable{

	@Override
	public void run() {
		System.out.println("hello");
	}
	public static void main(String[] args) throws InterruptedException{
		
		FindPrime obj = new FindPrime();
		obj.run();
		obj.start();
		
	}


}
