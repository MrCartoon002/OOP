import java.util.ArrayList;
import java.util.Scanner;
public class CalorieCount
{
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter No of Elf's:");
            int elfcount = sc.nextInt();

            ArrayList<Integer> a = new ArrayList<>();

            while(elfcount>0){
                System.out.print("Enter No of items :");
                int n = sc.nextInt();
                int sum = 0;

                for(int i=0; i<n; i++){
                    sum += sc.nextInt();
                }
                a.add(sum);
                sum = 0;
                elfcount--;
            }
            int max=0, elf=0;
            for(int c : a){
                if(c > max){
                    max = c;
                    elf = a.indexOf(c) + 1;
                }
            }
            System.out.println("Elf " + elf + " has " + max + " calories");

        }
}
