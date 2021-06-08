
import java.io.*;
import java.net.*;

class EchoClient
 {
     public static void main(String[] args) throws Exception 
	{
        Socket s = new Socket("localhost", 9999);
        BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        while(true)
		{
            System.out.print("Client : ");
            String str = br.readLine();
            pw.println(str);
            pw.flush();
            System.out.println();
            System.out.println("Server : " + str);
            System.out.println();
			if(!str.toUpperCase().equals("BYE"));
        } 
	
		
    }
}