package pack;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class First_Net {

	public static void main(String[] args) {
		try {
			InetAddress ocsaly = InetAddress.getByName("www.ocsaly.com");
			System.out.println(ocsaly.getHostName());
			System.out.println(ocsaly.getHostAddress());
			System.out.println(ocsaly.getAddress());
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
