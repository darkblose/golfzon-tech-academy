package test.com;

public class Test05ju4up_array {

	public static void main(String[] args) {
		// 반복문을 사용해서 주사위를 굴리고
		// 5번 나온결과를 배열에 저장하고 출력하세요.
		System.out.println("hello");
		int[] sus = new int[5];
		for (int i = 0; i < sus.length; i++) {
			double nanSu = Math.random();
			int ranSu = (int)(nanSu*6);
			int ju4up = ranSu+1;
			System.out.println("ju4up:"+ju4up);
			sus[i] = ju4up;
//			sus[i] = (int)(Math.random()*6)+1;
		}
		for (int i : sus) {
			System.out.println(i);
		}

	}//end main

}//end class
