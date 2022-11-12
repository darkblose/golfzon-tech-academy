package test.com;

public class Test01Main {

	public static void main(String[] args) {
		System.out.println("Hello interface...");
		
		//인터페이스 : 다중상속을 지원한다.
		//			인터페이스간의 상속 또는
		//			클래스와 인터페이스간의 상속
		// 모든 전역변수는 public static final이다.
		// 생성자가 없다
		// 메소드의 종류 : 블럭없는 abstract(생략가능)
		//				블럭있는 default,static
		String str = "kim";
		CharSequence cs1 = "lee";
		CharSequence cs2 = new String("lee");
		
		System.out.println(Father.MAX_MONEY);
		System.out.println(new Me_class().work());
		System.out.println(new Me_class().drive());
		System.out.println(Father.drink());
		System.out.println("==============");
		
		Me_class me = new Me_class();
		System.out.println(me.work());
		System.out.println(me.drive());
		me.aaa();
		System.out.println("==============");
		
		Father father = new Me_class();
		System.out.println(father.work());
		System.out.println(father.drive());
		System.out.println("==============");
		
		Father father2 = new Father() {
			@Override
			public int work() {
				System.out.println("anonymous inner");
				return 0;
			}
		};
		father2.work();
		
		System.out.println("===============");
		test(new Father() {
			@Override
			public int work() {
				System.out.println("args work()");
				return 0;
			}});
		Father me2 = new Father() {
			@Override
			public int work() {
				System.out.println("args work()");
				return 0;
			}};
	}//end main
	
	public static Father test(Father me) {
		me.work();
		return new Father() {
			@Override
			public int work() {
				System.out.println("args work()");
				return 0;
			}};
		//Me_class me = new Me_class();
	}

}//end class
