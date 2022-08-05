package test.com;

public class MemberOuter {
	
	int su = 100;
	String name = "kim";
	
	public void test() {
		System.out.println("test()...");
//		System.out.println(new Inner().num);
	}
	
	public class Inner {
		int num = 99;
		String str = "Hello";
		public Inner() {
			System.out.println("MemberOuter Inner()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
		public void sum() {
			System.out.println("sum()...");
			System.out.println(su);
			System.out.println(name);
//			test();
		}
	}

}
