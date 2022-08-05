package test.com;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Test02Main_Set {
    public static void main(String[] args) {
        System.out.println("Hello Set...");

        //데이터의 중복을 허용하지 않음
        //데이터가 추가되는 순서가 없다. (= 인덱스가 없다.)
        Set<String> s = new HashSet<String>();
        s.add("First");
        s.add("First");
        s.add("Second");
        s.add("Second");
        s.add(null);
        s.add(null);
        System.out.println(s.size());
        for (String x : s) { // 추가한 순서와 상관 없이 출력
            System.out.println(x);
        }
        System.out.println("=======================");
        s.remove("First");
        for (String x : s) { // 추가한 순서와 상관 없이 출력
            System.out.println(x);
        }

        System.out.println("=======================");
        s.clear();
        for (String x : s) {
            System.out.println(x);
        }

        System.out.println("=======================");
        s.add("lee1");
        s.add("lee2");
        s.add("lee3");
        s.add("lee3");
        s.add("lee4");
        s.add("lee4");
        for (String x : s) { // 추가한 순서와 상관 없이 출력
            System.out.println(x);
        }

        System.out.println("=======================");
        System.out.println("Is there 'lee2': " + s.contains("lee2"));
        System.out.println("Is there 'lee5': " + s.contains("lee5"));
        System.out.println("=======================");
        System.out.println(s.toArray());
        Object[] strs = s.toArray();
        System.out.println(strs[0]);
        for (Object x : strs) {
            System.out.println(x);
        }
        System.out.println("=======================");

//        for (Iterator<String> iterator = s.iterator(); iterator.hasNext(); ) {
//            String x = (String) iterator.next();
//        }
//
//        while (s.iterator().hasNext()) {
//            String x = (String) s.iterator().next();
//        }

        System.out.println("=======================");
        Set<MemberVO> vos = new HashSet<MemberVO>();
        vos.add(new MemberVO());
        vos.add(new MemberVO());
        vos.add(new MemberVO(11, "admin", "h11234", "KIM", "010-1111-2222"));
        vos.add(new MemberVO(11, "admin", "h11234", "KIM", "010-1111-2222"));
        vos.add(new MemberVO(11, "admin", "h11234", "KIM", "010-1111-3333"));

        MemberVO vo = new MemberVO();
        vo.setNum(1);
        vo.setId("tester");
        vo.setPw("h1234");
        vo.setTel("02");
        vos.add(vo);
        vos.add(vo);
        vos.add(vo);

        System.out.println(vos.size());
        for (MemberVO x : vos) {
            System.out.println(x);

        }
        System.out.println("=======================");
        System.out.println("end main....");
    }
    @Override //데이터클래스용 함수 재정의
    public int hashCode() {
        return super.hashCode();
    }

}
