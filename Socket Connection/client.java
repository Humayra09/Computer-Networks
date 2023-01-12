import java.io.*;
import java.net.*;
import java.util.Scanner;
 
class client
{
public static void main(String [] args) throws IOException
{
 
//will store the number entered by the user in client side program
int number;
 
//creating object of the scanner class
 
Scanner sc=new Scanner(System.in);
 
//objname.methodname()
int l=sc.nextInt();
int b=sc.nextInt();
 
//creating a socket
Socket s=new Socket("127.0.0.1",1654);
 
//creating an object of printstream class
PrintStream p=new PrintStream(s.getOutputStream());
 
 
p.println(l);
p.println(b);
 
 
Scanner sc1=new Scanner(s.getInputStream());
int area=sc1.nextInt();
 
 
System.out.println("Area is "+area);
}
 
}
