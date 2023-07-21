import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class sort {
    public static void main(String[] args) {
        ArrayList<Integer> demo=new ArrayList<>();
        List<String> demo1= Arrays.asList("Akash","Karuppiah","Jothiswaran");
        demo.add(9);
        demo.add(2);
        demo.add(0);
        demo.add(5);
        demo.add(7);
        demo.add(4);
        System.out.println("ArrayList:"+demo);
        System.out.println("ArrayList:"+demo1);
        demo.set(1,1);
        int n1=demo.get(2);
        System.out.println(n1);
        int n2=demo.remove(1);
        System.out.println(n2);
        int size=demo.size();
        System.out.println(size);
        demo.sort(Comparator.naturalOrder());
        System.out.println(demo);
        demo.sort(Comparator.reverseOrder());
        System.out.println(demo);
        demo1.sort(Comparator.naturalOrder());
        System.out.println(demo1);
        demo1.sort(Comparator.reverseOrder());
        System.out.println(demo1);
    }
}

