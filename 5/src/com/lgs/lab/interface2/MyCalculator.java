package com.lgs.lab.interface2;

import com.lgs.lab.interface1.Numerable;

public class MyCalculator implements Numerable{
private int a;
private int b;

public MyCalculator(int a, int b) {
	super();
	this.a = a;
	this.b = b;
}

@Override
public void plusOperation() {
	System.out.println(a+b);
	
}

@Override
public void minusOperation() {
	System.out.println(a-b);
	
}

@Override
public void multiplyOperation() {
	System.out.println(a*b);
	
}

@Override
public void divideOperation() {
	System.out.println(a/b);
	
}


}
