package test.com;

import java.lang.reflect.Member;
import java.util.*;

public class Test03Main_Map {
    public static void main(String[] args) {
        System.out.println("Hello Map");
//        key,value로 데이터를 여러 개 저장
//        맵핑, 바인딩: put(K,V) |모바일: put___(K,V) |웹: setAttr___(K,V) 형식으로 많이 쓰임
        Map<Integer, Integer> m = new HashMap<Integer, Integer>();
        m.put(0, 111); // 0번키를 111로 세팅하라
        m.put(0, 1111); // 0번키를 1111로 바꿔라 >> Key는 중복불가( = Set)
        m.put(1, 11111);
        m.put(2, 111111);
        System.out.println(m.size());

        System.out.println(m.get(0));
        System.out.println("=======================");

        Map<String, Double> m2 = new Hashtable<String, Double>();
        m2.put("pi", 3.14);
        m2.put("avg", 99.99);
        m2.put("ball_speed", 74.5);
        System.out.println(m2.size());
        System.out.println(m2.get(0));
        System.out.println(m2.get("pi"));
        System.out.println(m2.get("avg"));
        System.out.println(m2.get("ball_speed"));
//        m2.clear();
        m2.remove("pi");
        m2.put("ball_speed", 68.8);

        System.out.println("=======================");
        System.out.println(m2.keySet());
        for (String key : m2.keySet()) {
            System.out.println(key + " : " + m2.get(key));
        }
        System.out.println(m2.values());
        for (Double value : m2.values()) {
            System.out.println(value);
        }

        System.out.println("=======================");
        Map<String, MemberVO> m3 = new HashMap<String, MemberVO>();
        m3.put("vo1", new MemberVO());
        m3.put("vo2", new MemberVO(22, "ad1004", "ad1212", "adkim", "080"));
        MemberVO vo = new MemberVO();
        vo.setNum(33);
        vo.setId("ad33");
        vo.setPw("hi3333");
        vo.setName("lee33");
        vo.setTel("033");
        m3.put("vo3", vo);

        System.out.println("=======================");
        Map<String, List<MemberVO>> m4 = new HashMap</*String, List<MemberVO>*/>();
        List<MemberVO> vos = new ArrayList<MemberVO>();
        vos.add(new MemberVO());
        vos.add(new MemberVO());

        m4.put("vos", vos);
        for (MemberVO x : m4.get("vos")) {
            System.out.println(x);
        }

        System.out.println("=======================");
        System.out.println("End Main");
    }
}
