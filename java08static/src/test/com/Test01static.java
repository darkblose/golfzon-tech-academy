package test.com;

public class Test01static {
	
	int num1;
	static int num2;
	String name1;
	static String name2;
	
	static final String NAME_THREE = "yangssem";
	
	public static void run() {
		System.out.println("run()...");
	}
	
	public void start() {
		System.out.println("start()...");
		run();
		stop();
	}
	
	public static void sleep() {
		System.out.println("sleep()...");
		Test01static st = new Test01static();
		st.stop();
	}
	
	public void stop() {
		System.out.println("stop()...");
	}
	
	
}
