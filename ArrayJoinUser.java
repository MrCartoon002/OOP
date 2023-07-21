import java.util.*;

public class ArrayJoinUser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        System.out.print("Enter the elements of the first list :");
        String[] List1= sc.nextLine().split(" ");
        for (String element : List1) {
            list1.add(element);
        }

        System.out.print("Enter the elements of the second list :");
        String[] List2 = sc.nextLine().split(" ");
        for (String element : List2) {
            list2.add(element);
        }

        list1.addAll(list2);
        System.out.println("joined list : " + list1);
    }
}
