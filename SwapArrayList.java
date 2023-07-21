import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SwapArrayList {
    public static void main(String[] args {

        ArrayList <String> Colours = new ArrayList<String>();

        Colours.add("Red");
        Colours.add("Blue");
        Colours.add("Green");
        Colours.add("Yellow");
        Colours.add("Pink");

        System.out.print("Before Swapping : ");
        System.out.println(Colours);

        Collections.swap(Colours,0,2);
        System.out.print("After Swapping : ");
        System.out.println(Colours);
    }
}
