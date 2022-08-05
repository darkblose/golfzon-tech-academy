package test.com;

public class Test04multi_array2 {

	public static void main(String[] args) {
		// 다중배열,다차원배열.,,,

		// 1.동적배열
		String[][] strss = new String[][] { null, null };
		strss = new String[][] { 
			new String[] {}, new String[] {} };

		strss = new String[][] { 
			new String[] {"kim11","lee11"}, 
			new String[] {"kim22","lee22"}, 
			new String[] {"kosta","golfzon","Ori"} };

		System.out.println("strss.length:" + strss.length);

		//for~for 출력~
		for (int x = 0; x < strss.length; x++) {
			for (int i = 0; i < strss[x].length; i++) {
				System.out.print(strss[x][i]+" ");
			}
			System.out.println();
		}
		System.out.println("===========");
		//foreach~foreach
		for (String[] x : strss) {
			for (String i : x) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		System.out.println("===========");
		String x = new String("kim");
		String y = new String("kim");
		System.out.println(x==y);
		System.out.println(x.equals(y));//return true
		System.out.println(x.compareTo(y)==0);//return 0
		
		
		
	}// end main

}// end class
