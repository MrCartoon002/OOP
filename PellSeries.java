public class PellSeries
{
        public static void main(String args[])
        {
            int i,f=1,s=0,t;
            for(i=1;i<=20;i++)
            {
                t=f+s*2;
                System.out.print(" "+t);
                f=s;
                s=t;
            }
        }
}
