package inc.ywlee.oop.app;

import inc.ywlee.oop.lib.Calculator;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {
		// TODO Auto-generated method stub
		double sum=0;
		for (int i = 0; i < a.length; i++) {
			sum+=a[i];
		}
		return sum/a.length;
	}

	 

	@Override
	public int multiply(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

}
