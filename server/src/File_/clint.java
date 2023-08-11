package File_;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;

public class clint {
    public static void main(String[] args) throws IOException {
        System.out.println(InetAddress.getLocalHost());
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        OutputStream os = socket.getOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);
        bufferedOutputStream.write("hello".getBytes(StandardCharsets.UTF_8));
        bufferedOutputStream.flush();
        socket.shutdownOutput();
//        os.close();
//        socket.shut
//        downOutput();
        InputStream inputStream = socket.getInputStream();
        System.out.println(inputStream.read());
//        socket.shutdownOutput();
//        bufferedOutputStream.flush();
//        socket.shutdownOutput();
//        os.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
