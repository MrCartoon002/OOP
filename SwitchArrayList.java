import java.util.Scanner;
import java.util.ArrayList;
public class SwitchArrayList {
        public static void main(String args[]){

            ArrayList<String> ak1=new ArrayList<String>();
            ArrayList<Integer> ak2=new ArrayList<Integer>();

            Scanner ak=new Scanner(System.in);
            System.out.print("Enter choose\n 1.ADD\n 2.SET\3.");
            int ch=ak.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.print("Enter choose\n 1.String 2.Int");
                    int option=ak.nextInt();
                    if(option==1)
                    {
                        System.out.print("Enter the String ");
                        String str=ak.nextLine();
                        ak1.add(str);
                    }
                    else if(option==2)
                    {
                        System.out.print("Enter the String ");
                        int opt=ak.nextInt();
                        ak2.add(opt);
                    }
                    else
                    {
                        System.out.print("error");
                    }
                    break;
                }

                case 2:
                {
                    System.out.print("Enter the option\n 1.String 2.Int");
                    int option=ak.nextInt();
                    if(option==1)
                    {
                        System.out.print("Enter the String ");
                        String str=ak.nextLine();
                        System.out.print("enter th position");
                        int ks=ak.nextInt();
                        ak1.set(ks,str);
                    }
                    else if(option==2)
                    {
                        System.out.print("Enter the String ");
                        int opt=ak.nextInt();
                        System.out.print("enter th position");
                        int ks=ak.nextInt();
                        ak2.set(ks,opt);
                    }
                    else
                    {
                        System.out.print("error");
                    }

                }
                case 3:
                {
                    for(String obj:ak1)
                        System.out.println(obj);
                }
                case 4:
                {
                    for(int obj:ak2)
                        System.out.println(obj);
                }
            }

        }
    }
