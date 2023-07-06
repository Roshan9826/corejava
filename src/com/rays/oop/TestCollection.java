package com.rays.oop;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {

	public static void main(String[] args) {
		Collection list= new ArrayList();
      list.add("one");
      list.add("100");
      list.add("two");
      System.out.println(list);
      Collection c = new ArrayList();
      c.add ("three");
      c.add("700");
      c.add("four");
     // System.out.println(list);
      System.out.println(c);
      list.addAll(c);
     // System.out.println(list);
	}

}
