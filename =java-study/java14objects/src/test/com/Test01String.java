package test.com;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;

public class Test01String {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String txt = "Hello yangssem!!!";
        System.out.println("txt.length(): " + txt.length());
        System.out.println("txt.charAt(0): " + txt.charAt(0));
        System.out.println("txt.split(\" \"): " + txt.split(" "));
        System.out.println(txt.split(" ")[0]);
        System.out.println(txt.split(" ")[1]);
        System.out.println("txt.equals(\"kim\") : " + txt.equals("kim"));
        System.out.println("txt.equals(\"txt.equals(Hello yangssem!!!\") : " + txt.equals("Hello yangssem!!!"));
        System.out.println("txt.equals(\"txt.equals(hello yangssem!!!\") : " + txt.equals("hello yangssem!!!"));
        System.out.println("txt.equalsIgnoreCase(\"hello yangssem!!!\") : " + txt.equalsIgnoreCase("hello yangssem!!!"));
        System.out.println("txt.compareTo(\"hello yangssem!!!\"): " + txt.compareTo("hello yangssem!!!"));
        System.out.println("txt.compareToIgnoreCase(\"hello yangssem!!!\"): " + txt.compareToIgnoreCase("hello yangssem!!!"));
        System.out.println("txt.indexOf(\"h\") : " + txt.indexOf("h"));
        System.out.println("txt.indexOf(\"H\") : " + txt.indexOf("H"));
        System.out.println("txt.indexOf(\"s\") : " + txt.indexOf("s"));
        System.out.println("txt.startsWith(\"Hell\") : " + txt.startsWith("Hell"));
        System.out.println("txt.endsWith(\"Hell\") : " + txt.endsWith("Hell"));

        txt = "http://yangssem.com/golfzon/y2.png";
        System.out.println("txt.substring(27) : " + txt.substring(27));
        System.out.println(txt.lastIndexOf("/"));
        System.out.println("txt.substring(27) : " + txt.substring(txt.lastIndexOf("/")));

        System.out.println("txt.substring(27) : " + txt.substring(27));
        System.out.println("txt.substring(7,14+1) : " + txt.substring(7, 14 + 1));
        System.out.println("txt.substring(7,7+\"yangssem\".length())) : " + txt.substring(7, 7 + "yangssem".length()));

        System.out.println("txt.concat(\"/?id=admin\") : " + txt.concat("/?id=admin"));
        System.out.println("txt : " + txt);
        txt = txt.concat("/?id=admin");
        System.out.println("txt : " + txt);

        long startTime = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 100000; i++) {
            str = str + "Hello";
        }
        System.out.println("+ Time : " + (System.currentTimeMillis() - startTime));

        startTime = System.currentTimeMillis();
        str = "";
        for (int i = 0; i < 100000; i++) {
            str = str.concat("Hello");
        }
        System.out.println("concat Time : " + (System.currentTimeMillis() - startTime));

        StringBuffer sb = new StringBuffer();
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sb.append("Hello");
        }
        str = sb.toString();
        System.out.println("StringBuffer Time : " + (System.currentTimeMillis() - startTime));

        txt = "He l lo Wor ld !!";
        System.out.println("txt.contains(\"Hello\") : " + txt.contains("Hello"));
        System.out.println("txt.contains(\"World\") : " + txt.contains("World"));
        System.out.println("txt.contains(\"world\") : " + txt.contains("world"));

        System.out.println(txt);
        System.out.println("txt.replace(\"o\", \"O\") : " + txt.replace("o", "O"));
        txt = txt.replace("o", "O");
        System.out.println(txt);
        System.out.println("txt.replace(\"He\", \"히히\") : " + txt.replace("He", "히히"));
//        System.out.println(txt.replace("\s", "_"));

        char[] cs = txt.toCharArray();
        for (char c : cs) {
            System.out.println(c);
        }

        System.out.println("============================");
        System.out.println(txt.toLowerCase());
        System.out.println(txt.toUpperCase());
        txt = "            Hello World!!!              ";
        System.out.println(txt.length());
        System.out.println(txt.trim().length());

        System.out.println("============================");
        byte[] bs = txt.getBytes("utf-8");
        System.out.println(bs);
        for (byte b : bs) {
            System.out.println(b);
        }

        System.out.println("============================");
        System.out.println(txt.join("-", "aaa", "bbb", "cccc"));
        System.out.println(txt.join("-", new String[] {"aaa", "bbb", "cccc"}));
        System.out.println(String.valueOf(1000)+1000);




    }
}
