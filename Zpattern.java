import java.util.Scanner;
public class Zpattern
{
    public static void main(String[] args) {
        int[] a = new int[50];
        int n,i,j;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=1;i<=n;i++)
        {
            for (j = 0; j <= n; j++)
            {
                if (i == 1 || i == n)
                {
                    System.out.print("@");
                }
            }System.out.print("\n");
        }
        for(i=1;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if (i == 2 && j >= n - 1)
                {
                    System.out.print("#");
                }
            }System.out.print("\n");
        }
        for(i=1;i<=n;i++)
        {
            for(j=0;j<=n;j++)
            {
                if(i==3 && j>=n-3)
                {
                    System.out.print("@");
                }
            }
        }
} }
