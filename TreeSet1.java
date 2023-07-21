import java.util.*;
public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<String> ak = new TreeSet<String>();
        ak.add("Akash");
        ak.add("Sakthivel");
        ak.add("Jothis");

        Iterator i = ak.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        ak.remove("Akash");
        ak.pollFirst();
        Iterator i = ak.descendingIterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
