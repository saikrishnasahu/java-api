package networking;

import java.io.DataInputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Creating Server:
//To create the server application, we need to create the instance of ServerSocket class.
// Here, we are using 6666 port number for the communication between the client and server.
// You may also choose any other port number. The accept() method waits for the client.
// If clients connects with the given port number, it returns an instance of Socket.
public class MyServer {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);
            Socket s = ss.accept();//establishes connection
            DataInputStream dis = new DataInputStream(s.getInputStream());
            String str = dis.readUTF();
            System.out.println("message= " + str);
            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  