package test.com;

import java.io.*;

public class Test02PrintWriter {
    public static void main(String[] args) {
        System.out.println("Hello Output");

        String path = "golfzon.txt";
        File file = new File(path);
        FileOutputStream fos = null;
        PrintStream ps = null;
        try {
            fos = new FileOutputStream(file);
            ps = new PrintStream(fos);

            for (int i = 0; i < 5; i++) {
                ps.println("Hello Java..." + i);
            }
            ps.flush();
            System.out.println("ps success...");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ps != null) {
                ps.close();
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    } // end main
}
