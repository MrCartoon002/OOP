import java.util.Scanner;
public class Max1inRow
{
    public static void main(String[] args) {
        int m,n,i,j,temp=0,max=1,count=0;
        int[] a = new int[100];
        Scanner ak=new Scanner(System.in);
        m=ak.nextInt();
        n=ak.nextInt();
        for(i=0;i<m;i++)
        {
            for(j=0;i<n;i++)
            {
                a[i] = ak.nextInt();
            }
        }

        for(i=0;i<m;i++)
        {
            for(j=0;i<n;i++)
            {
              temp=a[i];
                if (a[i]==max) {
                    count++;
                }
            }
            System.out.println(count);
        }

    }
}
