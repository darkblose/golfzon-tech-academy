package test.com;

public class ScoreMain {

	public static void main(String[] args) {
		// ScoreVO객체 생성, 출력
		//int[] sus = new int[] {99,99,99};
		//String[] strs = new String[] {"kim","kim"};
		
//		ScoreVO vo = new ScoreVO();
		ScoreVO vo = new ScoreVO(11,"yangssem",88,88,88);
		
		ScoreVO vo2 = new ScoreVO(11,"yangssem",88,88,88);
		System.out.println(vo.equals(vo2));
		
		System.out.println(vo);
		vo.setNum(2);
		vo.setName("lee");
		vo.setKor(99);
		vo.setEng(99);
		vo.setMath(99);
		System.out.println(vo);
		
		//학생성적 3개 처리하는 배열을 만들고  출력
		//세터사용(임의의 데이터).
		//출력시 게터사용하시고 총점,평균,등급도 출력
		
		ScoreVO[] vos = new ScoreVO[3];
		for (int i = 0; i < vos.length; i++) {
			ScoreVO x = new ScoreVO();
			x.setNum(i+1);
			x.setKor(90+i);
			x.setEng(80+i);
			x.setMath(70+i);
			vos[i] = x;
		}
		for (ScoreVO x : vos) {
			int kor = x.getKor();
			int eng = x.getEng();
			int math = x.getMath();
			int total = kor+eng+math;
			double avg = total/3.0;
			String grade = "A";
			if(avg>=90) {
				grade = "A";
			}else if(avg>=80) {
				grade = "B";
			}else if(avg>=70) {
				grade = "C";
			}else if(avg>=60) {
				grade = "D";
			}else {
				grade = "F";
			}
			System.out.println(	 x.getNum()+","
								+kor+","
								+eng+","
								+math+","
								+total+","
								+avg+","
								+grade
					);
		}//end for
		
		
	}//end main

}//end class
