import java.util.ArrayDeque;
import java.util.Deque;

public class Dequeque1 {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();
        deque.add("Akash");
        deque.add("Riyas");

        for(String str : deque){
            System.out.println(str);
        }
    }

}
