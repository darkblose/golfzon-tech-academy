package test.com;

public class CMSmain {

	public static void main(String[] args) {
		System.out.println("Hello CMS");
		
		CMS cms = new CMS();
		System.out.println(cms);
		
		System.out.println("============");
		
		Car car = new Car("Benz", "Èò»ö", 200);
		
		MemberVO member = new MemberVO();
		member.setNum(1);
		member.setId("admin");
		member.setPw("hi1234");
		member.setName("lee");
		member.setTel("010");
		
		ScoreVO score = new ScoreVO();
		score.setNum(2);
		score.setName("lee");
		score.setKor(99);
		score.setEng(99);
		score.setMath(99);
		
		CMS cms2 = new CMS(car,member,score);
		System.out.println(cms2);
		System.out.println();
		System.out.print(cms2.getCar().getModel()+" ");
		System.out.print(cms2.getCar().getColor()+" ");
		System.out.println(cms2.getCar().getMaxSpeed());
		System.out.println();
		System.out.print(cms2.getMember().getNum()+" ");
		System.out.print(cms2.getMember().getId()+" ");
		System.out.print(cms2.getMember().getPw()+" ");
		System.out.print(cms2.getMember().getName()+" ");
		System.out.println(cms2.getMember().getTel());
		System.out.println();
		System.out.print(cms2.getScore().getNum()+" ");
		System.out.print(cms2.getScore().getKor()+" ");
		System.out.print(cms2.getScore().getEng()+" ");
		System.out.println(cms2.getScore().getMath()+" ");
		
		
	}// end main

}// end class
