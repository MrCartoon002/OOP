import java.util.*;

public class ArrayJoin {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("1030");
        list1.add("1020");
        list1.add("1010");
        list1.add("1040");
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("1050");
        list2.add("1060");
        list2.add("1070");
        list1.addAll(list2);
        System.out.println(list1);
    }
}
