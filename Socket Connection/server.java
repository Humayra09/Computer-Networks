
import java.io.*;
import java.net.*;
import java.util.Scanner;
 
class server
{
public static void main(String [] args) throws IOException
{
int number;
ServerSocket s=new ServerSocket(1654);
 
Socket so=s.accept();
 
Scanner sc=new Scanner(so.getInputStream());
 
int n=sc.nextInt();
int m=sc.nextInt();
 
int area=m*n;
PrintStream p=new PrintStream(so.getOutputStream());
 
System.out.println("Area calc here is "+area);
 
p.println(area);
}
 
}
