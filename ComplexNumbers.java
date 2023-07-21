import java.util.Scanner;
import java.util.Arrays;
public class ComplexNumbers
{
    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        Complex obj = new Complex();
        int[] ak = new int[2];[]
        int[] ak1 = new int[2];
        ak[0] = scan.nextInt();
        ak[1] = scan.nextInt();
        ak1[0] = scan.nextInt();
        ak1[1] = scan.nextInt();
        obj.sum(ak,ak1);
        obj.sub(ak,ak1);
        obj.pro(ak,ak1);
    }
}

public class Complex
{
    public void sum(int ak[], int ak1[]){
        System.out.println("Sum:"+(ak[0]+ak1[0])+ "+" + (ak[1]+ak1[1]) + "i");
    }

    public void sub(int ak[], int ak1[]){
        System.out.println("Sub:"+(ak[0]-ak1[0])+ "+" + (ak[1]-ak1[1]) + "i");
    }

    public void pro(int ak[], int ak1[]){
        int r,c;
        r = ak[0] * ak1[0];
        c = ak[0] * ak1[1];
        c += ak[1] * ak1[0];
        r += ak[1] * ak1[1] * -1;
        System.out.println("Pro:"+ r + "+" + c + "i");
    }
}
