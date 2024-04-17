package com.chainsys.jfsd5;

public class Area {
	int Length;
	int Breadth;

	Area(int length, int breadth) {
		this.Length = length;
		this.Breadth = breadth;
	}

	public int getLength() {
		return Length;
	}

	public void setLength(int length) {
		this.Length = length;
		if(length<0) {
			System.out.println("Enter the valid Number above Zero:");
			this.Length=length;
		}
	}

	public int getBreadth() {
		return Breadth;
	}

	public void setBreadth(int breadth) {
		this.Breadth = breadth;
	}

	public void getArea() {
		int area = Length * Breadth;
		System.out.println("Area: " + area);
	}

	@Override
	public String toString() {
		return "Area [length=" + Length + ", breadth=" + Breadth +  "]";
	}

}
