package socket_.client;

import socket_.Message;
import socket_.MessageType;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientEntry {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        View view = new View();
        view.start();
    }
}

class View {

    public void start() throws IOException, ClassNotFoundException {
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        Message message = new Message(MessageType.GET_ONLINE, s);
        OutputStream outputStream = socket.getOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(message);
        objectOutputStream.writeObject(message);
//        objectOutputStream.flush();
//        InputStream inputStream = socket.getInputStream();
//        int read = inputStream.read();
//        System.out.println(read);
//        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
//        Object o = objectInputStream.readObject();
//        Message m = (Message) o;
//        System.out.println(message.getContent());
//        objectOutputStream.close();
//        objectInputStream.close();
//        socket.close();
//        byte[] b = new byte[1024];
//        int i;
//        while ((i = inputStream.read(b))!= -1) {
//            System.out.println(new String(b, 0, i));
//        }

    }
}
