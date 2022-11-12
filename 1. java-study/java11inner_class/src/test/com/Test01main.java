package test.com;

import test.com.MemberOuter.Inner;
import test.com.StaticOuter.Inner_static;


public class Test01main {

	public static void main(String[] args) {
		System.out.println("Hello inner class");

		//4Á¾¼¼Æ®
		//1.member inner
		MemberOuter outer = new MemberOuter();
		outer.test();
		Inner inner = outer.new Inner();
		inner.sum();
		
		//2.static inner
		System.out.println(Inner_static.str);
		Inner_static.sum();
		new StaticOuter.Inner_static().plus();

//		setContent(R.layout.activity_main);

		/* final */ int su = 100;
		// su = 1000;
		/* final */String name = "kim";
		
		@SuppressWarnings("unused")
		//3.local inner
		class Inner_local{
			int num = 99;
			String str = "Hello";
			public Inner_local() {
				System.out.println("Inner_local()..");
				//su = 111;
				System.out.println(su);
				System.out.println(name);
			}
			public void minus() {
				System.out.println("minus()...");
			}
		}//end Inner_local class
		Inner_local local = new Inner_local();
		local.minus();
		
		
		//4.anonymous inner
		Mother m = new Mother() {
			double d = Math.PI * 10000;
			@Override
			public void play() {
				System.out.println(su);
				System.out.println(name);
				System.out.println(d);
			}
		};
		m.play();
		
	}// end main

}// end class
