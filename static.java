class staticblock
{
static int n;
static char str;
static
{
n=45;
str='a';
}
public static void main(String[] args)
{
System.out.println(n);
System.out.println(str);
}
}