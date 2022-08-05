package test.com;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

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

        System.out.println("=======================");
        System.out.println("End Main");
    }
}
