package test.com;

import java.io.*;

public class Test02throws {
    public static void main(String[] args) /*throws IOException*/ {
        System.out.println("Hello throws");
        // throws 처리: 예외 전가
        // try~catch : 예외 처리

        InputStream is = null;
        Reader r = null;
        BufferedReader br = null;

        try {
            is = System.in;
            r = new InputStreamReader(is);
            System.out.println(Integer.parseInt("a"));
            br = new BufferedReader(r);
            String txt = br.readLine();
        } catch (IOException e) {
            System.out.println("IOException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                }

                if (r != null) {
                    try {
                        r.close();
                    } catch (IOException e) {
                    }
                }
                if (is != null) {
                    try {
                        is.close();
                    } catch (IOException e) {
                    }
                }
            }
        }
        System.out.println("end main()...");
    }// end main
}// end class
