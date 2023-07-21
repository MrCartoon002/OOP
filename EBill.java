import java.util.Scanner;
public class EBill {
        public static void main(String args[])
        {
            int cno,pmr,cmr;
            String cna,ct;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter the customer no:");
            cno=s.nextInt();
            System.out.println("Enter the customer name:");
            cna=s.next();
            System.out.println("Enter the previous month reading:");
            pmr=s.nextInt();
            System.out.println("Enter the current month reading:");
            cmr=s.nextInt();
            System.out.println("Enter the EB connection type(C,D)");
            ct=s.next();

            if(ct.charAt(0)=='D')
            {

                if(cmr<=100)
                {
                    System.out.println(cmr*1);
                }
                else if(cmr>100 && cmr<=200)
                {
                    int ebill=(int)(100+(cmr-100)*2.50);
                    System.out.println(ebill);
                }
                else if(cmr>200 && cmr<=500)
                {
                    int ebill=(int)100+250+(cmr-200)*4;
                    System.out.println(ebill);
                }
                else if(cmr>500)
                {
                    int ebill=100+250+1200+(cmr-500)*6;
                    System.out.println(ebill);
                }
            }
        }
    }
