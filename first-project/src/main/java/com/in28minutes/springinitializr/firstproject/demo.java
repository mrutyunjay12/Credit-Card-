package com.in28minutes.springinitializr.firstproject;

import java.util.ArrayList;

public class demo {

	public static void main(String[] args) {
		ArrayList o=new ArrayList();
		o.add("krishna");
		o.add("Ram");
		o.add(1);
		System.out.println(o);
		String str=(String)o.get(1);
	}

	
}
