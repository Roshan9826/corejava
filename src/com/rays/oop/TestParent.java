package com.rays.oop;

public class TestParent {
	public static void main(String[] args) {
		ParentsClass Parentobj = new ParentsClass(10);
		Parentobj.parentMethod();
		
		ChildClass childobj = new ChildClass(20,30);
		childobj.parentMethod();
		childobj.childMethod();
		System.out.println("Parent Field:"+Parentobj.parent);
		System.out.println("Child PaPa:"+childobj.parent);
		System.out.println("Child Field:"+ childobj.child);
	}

	}


