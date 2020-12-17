package com.example.demo.model;

/**
 * @author Samir Swarup
 * Integrate the function in the interval [a,b]
 */
public class Polynomial {
	private int N;
	private double a;
	private double b;
	
	public Polynomial() {
		
	}
	
	public Polynomial(double a, double b, int N) {
		super();
		this.a=a;
		this.b=b;
		this.N=N;
	}
	
	public double f(double x) {
		return Math.exp(-x * x/2)/Math.sqrt(2 * Math.PI);
		
	}

	public int getN() {
		return N;
	}

	public void setN(int n) {
		N = n;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
