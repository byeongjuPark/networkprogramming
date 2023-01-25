package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {
	private Shape s = new Shape();
	
	public double calcPerimeter(double height, double width) {
		s = new Shape(4, height, width); //type?? -> 3(삼각형), 4(사각형)
		double result = (s.getHeight() *2)+(s.getWidth()*2);
		return result;
	}
	public double calcArea(double height, double width) {
		s = new Shape(4, height, width); //type?? -> 3(삼각형), 4(사각형)
		double result = s.getHeight() * s.getWidth();
		return result;
	}
	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		//TODO
		//+어떤모양인지?
		return "사각형 : " + s.information();
	}
}
