package networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetEg {
	public static void main(String args[]){
		try{
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("local ip address is "+local);
			System.out.println("Host name "+local.getHostName());
			System.out.println("Host address "+local.getHostAddress());
			InetAddress a1=InetAddress.getByName("www.rediff.com");
			System.out.println("Address of rediff "+a1);
			InetAddress a2[]=InetAddress.getAllByName("www.google.com");
			for(int i=0;i<a2.length;i++){
				System.out.println(a2[i]);
			}
			
		}catch(UnknownHostException e){
			System.err.println("Cant detect IP Address "+e);
		}
	}

}
