import inc.ywlee.oop.app.GoodCalc;
import inc.ywlee.oop.lib.Calculator;

public class TestDrive06 {

	public static void main(String[] args) {
		Calculator cal=new GoodCalc();
		System.out.println(cal.add(2, 3));
		System.out.println(cal.substract(2, 3));
		System.out.println(cal.average(new int[]{1,2,3}));
		
		System.out.println("Test");
	}

}
