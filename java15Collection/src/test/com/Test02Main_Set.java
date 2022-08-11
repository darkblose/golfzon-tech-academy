package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import test.com.member.MemberVO;

public class Test02main_Set {

	public static void main(String[] args) {
		System.out.println("Hello Set...");
		
		//데이터의 중복을 허용하지않음.
		//데이터가 추가되는 순서가 없다.인덱스가 없다.
		Set<String> s = new HashSet<String>();
		s.add("kim");
		s.add("kim");
		s.add("kim2");
		s.add("kim2");
		s.add(null);
		s.add(null);
		System.out.println(s.size());
		
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=====");
		s.remove("kim2");
		s.clear();
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=====");
		s.add("lee1");
		s.add("lee2");
		s.add("lee2");
		s.add("lee3");
		s.add("lee4");
		
		System.out.println("=====");
		for (String x : s) {
			System.out.println(x);
		}
		System.out.println("=====");
		System.out.println(s.contains("lee2"));
		System.out.println(s.toArray());
		Object[] strs =  s.toArray();
		System.out.println(strs[0]);
		System.out.println("=====");
		for (Object x : strs) {
			System.out.println(x);
		}
		System.out.println("=====");
		
		
//		for (Iterator<String> iterator = s.iterator(); iterator.hasNext();) {
//			String x = (String) iterator.next();
//		}
//		while (s.iterator().hasNext()) {
//			String x = (String) s.iterator().next();
//		}
		
		System.out.println("=====================");
		Set<MemberVO> vos = new HashSet<MemberVO>();
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
		for (MemberVO x : vos) {
			System.out.println(x);
		}
		
	}//end main

}//end class
