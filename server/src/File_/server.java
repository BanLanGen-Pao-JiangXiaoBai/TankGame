package File_;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class server {
    public static void main(String[] args) throws IOException {
        System.out.println("你好");
        ServerSocket serverSocket = new ServerSocket(9999);
        Socket s = serverSocket.accept();
        InputStream is = s.getInputStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(is);

        byte[] b = is.readAllBytes();
        System.out.println(new String(b));
        OutputStream outputStream = s.getOutputStream();
        outputStream.write(1);
        outputStream.flush();
        s.shutdownOutput();
        outputStream.close();
//        outputStream.write(1);
        is.close();
        s.close();
        serverSocket.close();

    }
}
