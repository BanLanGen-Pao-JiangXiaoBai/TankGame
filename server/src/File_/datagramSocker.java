package File_;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class datagramSocker {
    public static void main(String[] args) throws IOException {
        DatagramSocket datagramSocket = new DatagramSocket(9999);
        byte[] b = new byte[1024];
        DatagramPacket datagramPacket = new DatagramPacket(b, b.length);
        datagramSocket.receive(datagramPacket);
        int i = datagramPacket.getLength();
        byte[] res = datagramPacket.getData();
        System.out.println(new String(res, 0, i));
    }
}
