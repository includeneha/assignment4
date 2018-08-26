import java.util.Scanner;
class Rectangle
{
int length,breadth;
public void CalculateArea(int length,int breadth)
{
int area;
area=length*breadth;
System.out.println(area);
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int b=sc.nextInt();
Rectangle r=new Rectangle();
r.CalculateArea(l,b);
}
}
