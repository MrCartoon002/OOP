import java.util.Scanner;
public class pattern
{
    public static void main(String[] args) {
String a,b,c;
int i;
Scanner in=new Scanner(System.in);
a=in.nextLine();
b=in.nextLine();
c=in.nextLine();
for(i=0;i<a.length()-1;i++)
{
    System.out.print("*");
}
System.out.print(a);
        for(i=0;i<a.length()-1;i++)
        {
            System.out.print("*");
        }
        System.out.println();

        for(i=0;i<b.length()-1;i++)
        {
            System.out.print("*");
        }
        System.out.print(b);
        for(i=0;i<b.length()-1;i++) {
            System.out.print("*");
        }
        System.out.println();
        for(i=0;i<c.length()-1;i++)
        {
            System.out.print("*");
        }
        System.out.print(c);
        for(i=0;i<c.length()-1;i++)
        {
            System.out.print("*");
        }
    }
}
