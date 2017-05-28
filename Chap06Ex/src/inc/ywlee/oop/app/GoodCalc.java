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

	public static void main(String[] args) { 
		
		Calculator cal=new GoodCalc();
		System.out.println(cal.add(2, 3));
		System.out.println(cal.substract(2, 3));
		System.out.println(cal.average(new int[]{1,2,3}));

	}

}
