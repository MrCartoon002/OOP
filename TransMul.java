import java.util.Scanner;
public class TransMul
{
    public static void main(String[] args) {
        int m,n;
        Scanner ak = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        m = ak.nextInt();
        n = ak.nextInt();
        int[][] a = new int[m][n];
        int b[][] = new int[m][n];
        int c[][] = new int[m][n];
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            a[i][j] = ak.nextInt();
        }

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                b[i][j] = a[j][i];
            }
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                c[i][j]=0;
                for(int k=0;k<m;k++){
                    c[i][j] += a[i][k] * b[k][j];
                }
            }

        }

        for(int d[] : c){
            for(int ans: d){
                System.out.print(ans+" ");
            }
            System.out.print("\n");
        }


    }
}