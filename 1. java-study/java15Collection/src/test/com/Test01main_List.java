package test.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import test.com.member.MemberVO;

public class Test01main_List {

	public static void main(String[] args) {
		System.out.println("Hello Collection...");
		String[] strs = new String[] {"aaa","bbb"};
		
		//** 중복데이터 허용,순서있음, 널허용
		// 수정,삭제,추가,검색 가능.
		List<Integer> list = new ArrayList<>();
		list.add(1000);//Integer
		list.add(1000);//Integer
//		list.add("kim");//String
//		list.add("kim");//String
//		list.add(3.14);//Double
		list.add(null);//null
		list.add(11);//11
		list.add(22);//22
		list.add(0, 9999);//insert
		Object[] objs = list.toArray();
//		System.out.println(list.get(0));
//		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("======");
		list.remove(0);
		list.set(1, 999);
		
		for (Integer x : list) {
			System.out.println(x);
		}
		
		System.out.println("======");
		
		List<MemberVO> vos = new ArrayList<MemberVO>();
		
		vos.add(new MemberVO());
		vos.add(new MemberVO());
		vos.add(new MemberVO(11,"admin","hi1234","kim","010"));
		vos.add(new MemberVO(11,"admin","hi1234","kim","010"));
		
		MemberVO vo = new MemberVO();
		vo.setNum(1);
		vo.setId("tester");
		vo.setPw("hi2424");
		vo.setName("lee");
		vo.setTel("02");
		vos.add(vo);
		vos.add(vo);
		vos.add(vo);
		
		System.out.println(vos.size());
		System.out.println("==============");
		for (int i = 0; i < vos.size(); i++) {
			MemberVO x = vos.get(i);
			System.out.print(x.getNum()+" ");
			System.out.print(x.getId()+" ");
			System.out.print(x.getPw()+" ");
			System.out.print(x.getName()+" ");
			System.out.println(x.getTel());
		}
		
		System.out.println("==============");
		vos.clear();
		for (MemberVO x : vos) {
			System.out.print(x.getNum()+" ");
			System.out.print(x.getId()+" ");
			System.out.print(x.getPw()+" ");
			System.out.print(x.getName()+" ");
			System.out.println(x.getTel());
		}
		
		System.out.println("==============");
		
		
//		for (Iterator iterator = vos.iterator(); iterator.hasNext();) {
//			MemberVO memberVO = (MemberVO) iterator.next();
//			
//		}
//		while (vos.iterator().hasNext()) {
//			MemberVO x = (MemberVO) vos.iterator().next();
//			
//		}
		
		
	}//end main

}//end class
