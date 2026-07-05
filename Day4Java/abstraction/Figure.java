package com.coforge.Day4Java.abstraction;

public abstract class Figure implements AreaPlan {
	private int length;
	private int breadth;
	private int side;
	private long height;
	private long base;
	
	public Figure(int length, int breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	public Figure(int side) {
		this.side = side;
	}
	
	public Figure(long base, long height) {
		this.base = base;
		this.height = height;
	}
	
	public abstract void area();

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public long getHeight() {
		return height;
	}

	public void setHeight(long height) {
		this.height = height;
	}

	public long getBase() {
		return base;
	}

	public void setBase(long base) {
		this.base = base;
	}
	
	
}


