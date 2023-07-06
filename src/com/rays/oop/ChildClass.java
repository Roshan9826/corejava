package com.rays.oop;

public class  ChildClass extends ParentsClass{
	int child;
	public ChildClass(int parent , int child) {
		super(parent);
		this.child = child;
	}
	public void childMethod() {
		System.out.println("this is a child mathod");
	}

}
