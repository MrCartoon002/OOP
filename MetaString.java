import java.util.Scanner;
public class MetaString {
        public static void main(String[] args) {
            Scanner ak = new Scanner(System.in);
            String ak1 = ak.nextLine();
            String ak2 = ak.nextLine();

            int size = ak1.length();
            int count = 0;
            char a[] = new char[size];
            char b[] = new char[size];
            int pos = 0;
            for (int i = 0; i < size; i++) {
                if (ak1.charAt(i) != ak2.charAt(i)) {
                    count++;
                    a[pos] = ak1.charAt(i);
                    b[pos] = ak2.charAt(i);
                    pos++;
                }
            }
            if (count == 2) {
                if (a[0] == b[1] && b[0] == a[1]) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            } else {
                System.out.println("No");
            }
        }
}