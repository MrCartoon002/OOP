import java.util.Scanner;
public class FishCount
    {
    public static void main(String[] args)
    {
        int[] a = new int[100];
        int[] b = new int[100];
        int n,i,j,sum[]=0,sum1,temp;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        for(i=0;i<n;i++)
        {
            a[i] = s.nextInt();
        }
        for(i=0;i<n+80;i++)
        {
                b[i]=a[i]-1;
        }
        for(i=0;i<n+80;i++)
        {
            for(j=0;j<n+80;j++)
            {
                if (a[i] == 0) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp + 6;
                }
            }
        }
        for(i=0;i<n+80;i++)
        {
            for(j=0;j<n+80;j++)
            {
                a[j+1]=8;
            }
        }
        for(i=0;i<n+80;i++)
        {
            for(j=0;j<n+80;j++)
            {
                sum[]=sum[]+a[i]-b[i]-a[j+1];
                sum1=sum[].sizeof();
            }
        }
        System.out.print(" "+sum1);
        }

    }
