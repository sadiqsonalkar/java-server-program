import java.io.*;
import java.net.*;
class FactServer 
{   
	public static void main(String[] args) throws Exception
		{
        	ServerSocket ss=new ServerSocket(9999);
        	Socket s=ss.accept();
        	BufferedReader sbr=new BufferedReader(new InputStreamReader(s.getInputStream()));
        	String str=sbr.readLine();
        	System.out.println("Number received:" + str);
        	int num=Integer.parseInt(str);
        	int fact= factorial(num);        
        	PrintStream str2=new PrintStream(s.getOutputStream());
        	str2.println(String.valueOf(fact));
        	s.close();
        	ss.close();
    	}
    	public static int factorial(int n)
		{
        	if(n==1)
            	return 1;
        	else 
            	return n*factorial(n-1);
    	}
}