package test.com;

public class Test01class_members {

	//1.fields-전역변수,상수,static or instance
	public String name;//null
	
	//2.constructors
	public Test01class_members() {
		// init fields : 속성초기화.
		name = "kim";
	}
	
	//3.methods : 함수,function
	//		static or instance
	public void start() {
		//기능
	}
	public static void stop() {
		//기능.
	}
	//4.class(inner class-instance,static,local,anonymous)
	public class Inner{}
	
}
