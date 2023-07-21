import java.io.*;
import java.util.Scanner;

class jss {
    public void js(String stq,int n){
        jss cs=new jss();
        jss sp =new jss();
        jss sr=new jss();
        jss sr1=new jss();
        jss sp1=new jss();
        sp.space(n);
        sr.starr(n);
        sp.space(n);
        System.out.print("\n");
        sr1.star1(n);
        sp1.space1(n);
        sr1.star1(n);
        System.out.print("\n");
        cs.star(n);
        System.out.print(stq);
        cs.star(n);
        System.out.print("\n");
        sr1.star1(n);
        sp1.space1(n);
        sr1.star1(n);
        System.out.print("\n");
        sp.space(n);
        sr.starr(n);
        sp.space(n);
    }
    public void star(int n)
    {
        for(int i=0;i<n-10;i++)
        {
            System.out.print("*");
        }
    }
    public void space(int n)
    {
        for(int i=0;i<n-10;i++)
        {
            System.out.print(" ");
        }
    }
    public void space1(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(" ");
        }
    }
    public void starr(int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print("*");
        }
    }
    public void star1(int n)
    {
        for(int i=0;i<n-10;i++)
        {
            System.out.print("*");
        }
    }

    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);


        char ch1,ch;
        int count=0,count2=0;



        jss ks=new jss();
        String str=sc.nextLine();


        //String str1=sc.nextLine();

        ks.js(str,str.length());




        //System.out.print(count);
        //ount2=str.length()-count;




    }
}