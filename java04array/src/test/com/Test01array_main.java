package test.com;

public class Test01array_main {
	
	int[] su = {1,2,3,4,5,6,0};
	
	public Test01array_main() {
		su = new int[]{1,2,3,4,5,6,0};
	}

	public static void main(String[] args) {
		// 배열
		System.out.println("Hello array...");
		
		//1.배열의 동적할당.
//		String[] namea = new String[]{"kim",null,"kim","kim"};
		String[] namea = /* new String[] */{"kim",null,"kim","kim"};
		namea =  new String[] {"kim3",null,"kim3","kim3"};
		namea[0] = "lee";
		System.out.println(namea[0]);
		System.out.println(namea[1]);
		Integer x = 10;
		System.out.println(x.toString());//"10"
		int[] su = new int[]{2100000000,2,3,4,5,6,1110};
		System.out.println(su[0]);
		System.out.println(su[5]);
		System.out.println("su.length:"+su.length);
		System.out.println(su[su.length-1]);
		
		double[] dd = new double[]{0.1,0.2,0.3};
		dd = new double[]{0.1,0.2,0.3,0.2,0.3,0.2,0.3};
		for (int i = 0; i < dd.length; i++) {
			System.out.println(dd[i]);
		}
		
		
		
		boolean[] bb = new boolean[]{true,false};
		bb = new boolean[]{true,true,false,true,false};
		for (int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}
		
		
		Test01array_main[] tm = new Test01array_main[]{null,new Test01array_main()};
		
		int[] scores = null;
		scores = new int[] {11,22,33};
		
		
		
	}//end main

}//end class
