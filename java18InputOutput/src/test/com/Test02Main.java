package test.com;

import java.io.*;
import java.net.URL;

public class Test02Main {
    public static void main(String[] args) {
        System.out.println("Hello io");

//        Class<?> tm_clazz = Test02Main.class;
//        URL url = tm_clazz.getResource("language.txt");
        String path = "C:\\Projects\\IdeaProjects\\golfzon\\javaStudy\\java18InputOutput\\txt\\language.txt";
        System.out.println(path);

        Reader fr = null;
        BufferedReader br = null;
        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            while (true) {
                String data = br.readLine();
                if (data == null) {
                    break;
                }
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
