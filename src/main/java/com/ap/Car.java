package com.ap;

public class Car {
	
	private IEngine eng;
	
	public Car(){
		System.out.println("car constructer called");
	}
	
	
	public IEngine getEng() {
		return eng;
	}

	public void setEng(IEngine eng) {
		System.out.println("setter method called");
		this.eng = eng;
		eng.start();
	}



	public Car(IEngine eng) {
		super();
		this.eng = eng;
	}

	


	
}
