package com.ap;

public class PetrolEngine implements IEngine{
	
	public PetrolEngine() {
		System.out.println("petrol engine constructer started....");
	}
	
	@Override
	public int start() {
		
		System.out.println("perol start method started");

		return 1;
	}

}
