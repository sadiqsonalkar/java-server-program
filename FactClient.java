
import java.io.*;
import java.net.*;

class FactClient
 {
     public static void main(String[] args) throws Exception 
	{
        Socket s = new Socket("localhost", 9999);
        BufferedReader sbr = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(s.getOutputStream());
        while(true)
		{
            System.out.print("Enter the number : ");
            String str = br.readLine();
            pw.println(str);
            pw.flush();
            System.out.println();
            String ans = sbr.readLine();
            System.out.println("Factorial is  : " + ans);
            System.out.println();
						break;
        } 
		s.close();
	
		
    }
}