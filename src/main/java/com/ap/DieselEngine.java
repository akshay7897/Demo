package com.ap;

public class DieselEngine implements IEngine {
	
	public DieselEngine(){
		System.out.println("dieselEngine Constructer started");
	}

	@Override
	public int start() {
		System.out.println("diesel engine start() started");
		return 1;
	}

}
