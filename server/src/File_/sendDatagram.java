package File_;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

public class sendDatagram {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9998);
        DatagramPacket datagramPacket = new DatagramPacket("hello".getBytes(StandardCharsets.UTF_8), 5,InetAddress.getLocalHost(), 9999);
        datagramSocket.send(datagramPacket);
        datagramSocket.close();
    }
}
