package test.com;

public class Test01array_main2 {


    public static void main(String[] args) {
        // 배열
        System.out.println("Hello array...");

        //2.배열의 정적할당.
        //배열의 길이를 먼저 정의
        int[] sus = new int[5];
        System.out.println(sus);
//		sus[0] = 100;
//		sus[1] = 1000;
//		sus[2] = 10000;
//		sus[3] = 100000;
//		sus[4] = 1000000;
        //sus[-1] = 10000000;
        //sus[5] = 10000000;
        for (int i = 0; i < sus.length; i++) {
            sus[i] = (int) (10 * Math.pow(10, i + 1));
        }
        System.out.println("sus.length:" + sus.length);
        for (int i = 0; i < sus.length; i++) {
            System.out.println(sus[i]);
        }

        System.out.println("=================");
        double[] ds = new double[5];
        System.out.println(ds);
        for (int i = 0; i < ds.length; i++) {
            if (i % 2 == 0) ds[i] = Math.PI;
        }
        for (int i = 0; i < ds.length; i++) {
            System.out.println(ds[i]);
        }
        System.out.println("=================");

        //boolean데이터가 3개 들어있는 배열을 생성,출력하세요
        boolean[] bools = new boolean[3];
        System.out.println(bools);
        for (int i = 0; i < bools.length; i++) {
            bools[i] = true;
        }
        for (int i = 0; i < bools.length; i++) {
            System.out.println(bools[i]);
        }
        for (boolean b : bools) {
            System.out.println(b);
        }

        System.out.println("=================");

        //이름이 3개들어있는 문자열배열을 생성,출력하세요
        String[] names = new String[3];//null,null,null
        System.out.println(names);
        for (int i = 0; i < names.length; i++) {
            names[i] = "kim" + i;
        }
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

        String[][] namess = new String[2][];
        System.out.println(namess[0]);
        for (String[] x : namess) {
            for (String a : x) {

            }
        }

    }//end main

}//end class
