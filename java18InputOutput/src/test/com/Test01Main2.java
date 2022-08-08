package test.com;

import java.io.*;

public class Test01Main2 {
    public static void main(String[] args) {
        System.out.println("Hello io");

//        Class<?> tm_clazz = Test02Main.class;
//        URL url = tm_clazz.getResource("language.txt");
        String path = "C:\\Projects\\IdeaProjects\\golfzon\\javaStudy\\java18InputOutput\\txt\\language.txt";

        System.out.println(path);
        File file = new File(path);
        System.out.println(file.exists());
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());

        if (file.exists()) {
            Reader fr = null;
            BufferedReader br = null;
            try {
                fr = new FileReader(path);
                br = new BufferedReader(fr);
                String data = "";
                StringBuilder sb = new StringBuilder();
                while ((data = br.readLine()) != null) {
                    System.out.println(data);
                    sb.append(data + "\n");
                }
                System.out.println(sb.toString());
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
}
