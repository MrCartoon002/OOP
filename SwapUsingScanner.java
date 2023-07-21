import java.util.ArrayList;
import java.util.Scanner;
public class SwapUsingScanner {
        public static void main(String[] args) {

            int n,i1,i2;

            Scanner ak = new Scanner(System.in);
            ArrayList <String> Colours = new ArrayList<String>();

            System.out.println("Enter No. of Strings");
            n = ak.nextInt();

            System.out.println("Enter the Colours : ");
            for(int i=0; i<n; i++)
            {
                Colours.add(ak.next());
            }

            System.out.println("Enter the First Index : ");
            i1 = ak.nextInt();

            System.out.println("Enter the Second Index : ");
            i2 = ak.nextInt();

            System.out.println("Before Swapping : " +Colours);

            String Swap = Colours.get(i1);
            Colours.set(i1, Colours.get(i2));
            Colours.set(i2, Swap);

            System.out.println("After Swapping : " +Colours);
        }
}
