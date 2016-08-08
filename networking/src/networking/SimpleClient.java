package networking;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

import org.omg.CORBA.portable.InputStream;

public class SimpleClient {
	java.io.InputStream is;
	static Socket sock;
	static DataOutputStream dos;
	static DataInputStream din;
	public static void main(String args[]) throws IOException{
		try {
			sock = new Socket(InetAddress.getByName("192.168.1.103"),8901);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dos = new DataOutputStream(sock.getOutputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			din = new DataInputStream(sock.getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dos.writeUTF("hey i am "+InetAddress.getLocalHost().getHostName());
		System.out.println(din.readUTF());
		dos.close();
		din.close();
		sock.close();
	}
	
}
