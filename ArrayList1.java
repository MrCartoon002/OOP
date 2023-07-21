import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayList1 {
    public static void main(String[] args)
    {
        // Defining a String Array
        String sa[] = { "A", "B", "C", "D", "E", "F" };
        //
        System.out.println("Initial Array:\n"
                + Arrays.toString(sa));
        String ne = "G"; // Define new element to add
        List<String>l = new ArrayList<String>(
                Arrays.asList(sa)); // Convert Array to ArrayList
        l.add(ne); // Add new element in ArrayList l
        sa = l.toArray(sa); // Revert Conversion from ArrayList to Array
        // printing the new Array
        System.out.println("Array with added Value: \n"
                + Arrays.toString(sa)) ;
    }
}