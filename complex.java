import java.util.Scanner;
class Complex
{
int real,imag;
public void Display(int real,int imag)
{
System.out.println(real+"+"+imag+"i");
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int r=sc.nextInt();
int i=sc.nextInt();
Complex c=new Complex();
c.Display(r,i);
}
}

