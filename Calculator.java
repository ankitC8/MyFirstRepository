package com.example.demo;

public class Calculator {

	int a;
	int b;

	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Calculator() {
		super();
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}
	
	public int add(int a,int b) {
		
		return a+b;
	}

}
