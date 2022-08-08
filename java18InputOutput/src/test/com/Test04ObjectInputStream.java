package test.com;

import java.io.*;
import java.util.List;

public class Test04ObjectInputStream {

    public static void main(String[] args) {
        System.out.println("Hello ObjectInputStream");
        String path = "test.db";
        File file = new File(path);
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(file);
            ois = new ObjectInputStream(fis);

            List<TestVO> vos = (List<TestVO>) ois.readObject();
            for (int i = 0; i < vos.size(); i++) {
                System.out.println(vos.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }//end main

}//end class