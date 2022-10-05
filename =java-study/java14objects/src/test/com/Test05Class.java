package test.com;

public class Test05Class {
    public static void main(String[] args) {
        System.out.println("Hello Class");

        try {
            Class<?> clazz = Class.forName("test.com.mine.MemberVO");
            System.out.println("class Found");
            System.out.println(clazz.getName());
            System.out.println(clazz.getConstructors()[0]);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("============================");
        Class<?> clazz2 = MemberVO.class;
        System.out.println(clazz2.getName());

        System.out.println("============================");
        MemberVO vo = new MemberVO();
        Class<?> clazz3 = new MemberVO().getClass();
        System.out.println(clazz3.getName());



    }
}
