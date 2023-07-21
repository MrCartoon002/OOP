import java.util.Scanner;
public class divisible
{
public static void main(String args[])
{
int n,div;
Scanner s=new Scanner(System.in);
System.out.println("Enter the number");
n=s.nextInt();
if(n%3==0)
System.out.println("Divisible by 3 : "+n);
}
}