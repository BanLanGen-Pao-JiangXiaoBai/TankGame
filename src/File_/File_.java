package File_;

import org.junit.Test;

import java.io.*;

public class File_ {
    public static final String path = "/Users/dumenglong";

    public static void main(String[] args) {

    }

    @Test
    public void createFile() {
        File parentFile = new File(path);
        File file = new File(parentFile, "hello.txt1");
        try {
            if(file.createNewFile()) {
                System.out.println("创建成功");
            } else {
                System.out.println("创建失败");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void inputStream() {
        File file = new File(path, "hello.txt");
        FileInputStream fileInputStream = null;
        int c = 0;
        byte[] b = new byte[9];
        try {
            fileInputStream = new FileInputStream(file);
            // read a byte
//            while ((c = fileInputStream.read()) != -1) {
//                System.out.print((char) c);
//            }
            // read a byte array
//            while ((c = fileInputStream.read(b)) != -1) {
//                System.out.println(c);
//                System.out.println(new String(b, 0, c));
//            }
            // read a byte array with offset
//            while ((c = fileInputStream.read(b, 0, 9)) != -1) {
//                System.out.println(new String(b, 0, c));
//            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    @Test
    public void writeStream() {
        File file = new File(path, "hello.txt");
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(file, true);
            fileOutputStream.write("hello 梦龙\n".getBytes());
            fileOutputStream.write("append\n".getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
    @Test
    public void copy() {
        File file = new File(path, "hello.txt");
        File file1 = new File(path, "hello1.txt");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            fileOutputStream = new FileOutputStream(file1);
            int i;
            byte[] b = new byte[9];
            while ((i = fileInputStream.read(b, 0 ,9)) != -1) {
                fileOutputStream.write(b, 0, i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public  void fileWrite() {
        FileReader fileReader = new FileReader();
    }
}
