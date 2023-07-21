import java.util.Scanner;
import java.util.ArrayList;
public class ArrayListCompare {

        public static void main(String[] args) {
            ArrayList<String> a = new ArrayList<String>();
            ArrayList<String> b = new ArrayList<String>();
            Scanner sc = new Scanner(System.in);
            int c = 0;
            int n = sc.nextInt();
            int n2 = sc.nextInt();
            int min = Math.min(n, n2);
            System.out.println("Enter elements of a:");
            for (int i = 0; i < n; i++) {
                a.add(i, sc.next());
            }
            System.out.println("Enter elements of b:");
            for (int i = 0; i < n2; i++) {
                b.add(i, sc.next());
            }
            int val = 0;
            if (n >= n2) {
                for (int i = 0; i < n; i++) {
                    c = 0;
                    for (int j = 0; j < n2; j++) {
                        if (a.get(i).equals(b.get(j))) {
                            c++;
                        }
                    }
                    System.out.println("count" + c);
                    if (c == 0)
                        continue;
                    else
                        val++;
                }
                if (val == min)
                    System.out.println("Array List is equal");
                else
                    System.out.println("No");
            } else {
                for (int i = 0; i < n2; i++) {
                    c = 0;
                    for (int j = 0; j < n; j++) {
                        if (b.get(i).equals(a.get(j))) {
                            c++;
                        }
                    }
                    if (c == 0)
                        continue;
                    else
                        val++;
                }
                if (val == min)
                    System.out.println("Array List is equal");
                else
                    System.out.println("No");
            }
        }
    }
