package pack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URL_class {

	public static void main(String[] args) {
		try {
			URL url = new URL("https://ocsaly.com");
			URLConnection myCon = url.openConnection();
			BufferedReader br = new BufferedReader(new InputStreamReader(myCon.getInputStream()));
			String myLine;
			while((myLine = br.readLine())!=null) {
				System.out.println(myLine);
			}
			
			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
