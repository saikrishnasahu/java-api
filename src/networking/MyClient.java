package networking;

import java.io.DataOutputStream;
import java.net.Socket;

//Creating Client:
//To create the client application, we need to create the instance of Socket class.
// Here, we need to pass the IP address or hostname of the Server and a port number.
// Here, we are using "localhost" because our server is running on same system.
public class MyClient {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());
            dout.writeUTF("Hello Server");
            dout.flush();
            dout.close();
            s.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}  