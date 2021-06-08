
import java.io.*;
import java.net.*;

class ChatClient
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
            String ans = sbr.readLine();
            System.out.println("Server : " + ans);
            System.out.println();
			if(!str.toUpperCase().equals("BYE"));
						break;
        } 
		s.close();
	
		
    }
}