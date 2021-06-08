import java.io.*;
import java.net.*;
class ChatServer 
{
    public static void main(String[] args) throws Exception
	{
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();
        BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        while(true)
		{
            String str = sbr.readLine();
            System.out.println("Client : " + str);
            System.out.print("Server : ");
            String ans = br.readLine();
            pw.println(ans);
            pw.flush();
            System.out.println();
			if(!str.toUpperCase().equals("BYE"));
				break;
		}
		s.close();
		ss.close();
	}
	
    
}
