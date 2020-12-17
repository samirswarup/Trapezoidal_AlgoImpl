package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Polynomial;

@RestController
public class TrapezoidalRuleController {
	
	@RequestMapping(value = "/compute", method = RequestMethod.GET)
	public double ComputeRule() {
		Polynomial poly = new Polynomial(4.0,6.0,4);
		double a= poly.getA();
		double b=poly.getB();
		int N = poly.getN();
		
		double h = (b - a) / N;              
	      double sum = 0.5 * (poly.f(a) + poly.f(b));    // area
	      for (int i = 1; i < N; i++) {
	         double x = a + h * i;
	         sum = sum + poly.f(x);
	      }
	      System.out.println("Result :  "+sum*h);

	      return sum * h;
	}

}
