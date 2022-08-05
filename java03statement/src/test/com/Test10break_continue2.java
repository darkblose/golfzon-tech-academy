package test.com;

public class Test10break_continue2 {

	public static void main(String[] args) {
		// switch or 반복문내에서 제어가 필요할때
		// 그만 >> break 
		//		-if문의 블럭을 제외한 가장 가까운 블럭을 빠져나가라.
		// 스킵(건너뛰기) >>continue  
		//		-if문의 블럭을 제외한 가장 가까운 블럭의 끝으로가라.

		// 함수를 콜할곳으로 돌아가라 >> return
		
		for (int x = 0; x < 5; x++) {
			if(x==2)break;
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		System.out.println("================");
		
		
		for (int x = 0; x < 5; x++) {
			if(x==2)continue;
			System.out.print(x+":");
			for (int i = 0; i < 10; i++) {
				System.out.print(i);
			}
			System.out.println();
		}
		
	}//end main

}//end class
