import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class PriorityQueue1 {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<String>();
        queue.add("Sakthivel");
        queue.add("Jothis");
        queue.add("Akash");

        System.out.println("head:" + queue.element());
        System.out.println("head:" + queue.peek());
        System.out.println("head:" + queue.poll());

        Iterator i = queue.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        queue.remove();
        queue.poll();

        Iterator i2 = queue.iterator();
        while(i.hasNext())
        {
            System.out.println(i2.next());
        }

    }
}
