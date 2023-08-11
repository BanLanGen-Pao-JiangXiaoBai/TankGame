package socket_.server;

import socket_.Message;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class serverEntry {
    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start();
//        System.out.println("end");
    }
}

class Server extends Thread{
    ServerSocket serverSocket = new ServerSocket(9999);

    Server() throws IOException {
    }

    @Override
    public void run() {
        while (true) {
            try {
                Socket socket = serverSocket.accept();
                InputStream inputStream = socket.getInputStream();
                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                Object o = objectInputStream.readObject();
                Message m = (Message) o;
                System.out.println(m.getContent());
//                ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
                Object o1 = objectInputStream.readObject();
                Message m1 = (Message) o;
                System.out.println(m1.getContent());
//                objectInputStream.close();
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write(1);
                socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void close() throws IOException {
        serverSocket.close();
    }
}