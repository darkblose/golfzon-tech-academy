package test.com;

public class CafeMain {

	public static void main(String[] args) {
		System.out.println("Hello cafe....");
		
		CafeVO vo = new CafeVO();
		System.out.println(vo);
		
		vo = new CafeVO(new StarBugs(),new MegaCoffee());
		System.out.println(vo);
		
		vo = new CafeVO(new StarBugs(1,"Ori","Yang",new String[] {"aa","ddaa","ddalgilatte"}),new MegaCoffee());
		System.out.println(vo);
		
		
		
	}//end main

}//end class
