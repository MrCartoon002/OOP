import java.util.Scanner;
public class FriendCount
{
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[100];
        int n,i,alter=0,count=0;
        Scanner ak=new Scanner(System.in);
        n=ak.nextInt();
        for(i=0;i<n;i++)
        {
            a[i] = ak.nextInt();
        }
        for(i=0;i<n;i++)
        {
            alter=a[i];
            b[i+1]=alter;
            if(a[i]!=b[i])
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
