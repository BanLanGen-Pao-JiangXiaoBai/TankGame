package File_;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Date;

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
    public  void fileReader() {
        File file = new File("d://", "hello.txt");
        FileReader fileReader = null;
        int i;
        char[] c = new char[8];
        try {
            fileReader = new FileReader(file);
//            while ((i = fileReader.read()) != -1) {
//                System.out.print((char) i);
//            }
//            while ((i = fileReader.read(c)) != -1) {
//                System.out.println(new String(c, 0, i));
//            }
//            while ((i = fileReader.read(c, 0, 5)) != -1) {
//                System.out.println(new String(c, 0, i));
//            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
    @Test
    public void fileWrite() {
        File file = new File("d://", "hello.txt");
        File file1 = new File("d://", "hello1.txt");
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        try {
            fileReader = new FileReader(file);
            fileWriter = new FileWriter(file1);
            int i;
            char[] c = new char[8];
            while ((i = fileReader.read(c))!= -1) {
                fileWriter.write(c, 0, i);
            }
        } catch (IOException e) {

        } finally {
            try {
                fileReader.close();
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    private final File file = new File("d://hello.txt");
    @Test
    public void bufferedReader() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String s  = bufferedReader.readLine();
        System.out.println(s);
        bufferedReader.close();
    }

    @Test
    public void bufferInputStream() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        int i;
        byte[] b = new byte[8];
        while ((i = bufferedInputStream.read(b))!=-1) {
            System.out.println(new String(b, 0, i));
        }
        bufferedInputStream.close();
    }

    @Test
    public void bufferOutputStream() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("d://15.28.txt"));
        int i;
        byte[] b = new byte[8];
        while ((i = bufferedInputStream.read(b))!=-1) {
//            System.out.println(new String(b, 0, i));
            bufferedOutputStream.write(b, 0 , i);
            bufferedOutputStream.flush();
        }
        bufferedInputStream.close();
        bufferedOutputStream.close();
    }
    @Test
    public void objectOutputStream() throws IOException {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(new File("d://19.01.dat")));
        objectOutputStream.write(1);
        objectOutputStream.writeObject(new Date());

//        objectOutputStream.writeInt(2);
        objectOutputStream.close();
    }
    @Test
    public void objectInputStream() throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(new File("d://19.01.dat")));
        int i = objectInputStream.read();
        System.out.println(i);
        Object o = objectInputStream.readObject();
        System.out.println(o);
        Date d = (Date) o;
        System.out.println(d);
//        int x = objectInputStream.readInt();
////        int x = objectInputStream.readInt();
//        System.out.println(x);
        objectInputStream.close();
    }
    @Test
    public void inputStreamReader() throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(new File("d://16.40.txt")), "gbk");
        char[] c = new char[102];
        int i;
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        System.out.println(bufferedReader.readLine());
        System.out.println("你好");
        bufferedReader.close();
    }
    @Test
    public void outputStreamWriter() {

    }
}
