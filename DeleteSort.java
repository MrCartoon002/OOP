import java.util.ArrayList;
import java.util.Comparator;
public class DeleteSort
{
    public static void main(String[] args) {
        ArrayList<Integer> ak=new ArrayList<>();
        ak.add(3);
        ak.add(4);
        ak.add(5);
        ak.add(1);
        ak.add(2);
        int removedStr = ak.remove(0);
        System.out.println("Elements after deleted: "+ak);
        System.out.println("Element not found: "+removedStr);
        ak.sort(Comparator.naturalOrder());
        System.out.println("Sorted output: "+ak);
    }
}
